package TP3.ex2;
import java.util.List;
import java.util.ArrayList;


public class Enveloppe {
    
    Page [] pages;
    int _pMax;
    boolean opened;

    public Enveloppe(){

    }

    public void open(){
        this.opened = true;
    }

    public void close(){
        this.opened = false;
    }

    boolean addPage(Page page){
        if (_pMax == this.pages.length){
            return false;
        }
        Page [] newPage = new Page[this.pages.length + 1];
        for (int i = 0; i < this.pages.length; i++){
            newPage[i] = this.pages[i];
        }
        newPage[-1] = page;
        this.pages = newPage;
        return true;
    }

    boolean addPage2(Page page){
        if (_pMax == this.pages.length){
            return false;
        }
        List<Page> newPage = new ArrayList<>();
        for (int i = 0; i < this.pages.length; i++){
            newPage.add(this.pages[i]);
        }
        newPage.add(page);
        this.pages = newPage.toArray(new Page[0]);
        return true;
    }

    public void read(){
        if(this.opened){
            for (int i = 0; i < this.pages.length; i++){
                Page p = pages[i];
                System.out.println(p);
                p.flip();
                System.out.println(p);
            }
        }
    }

    public void size() {
        System.out.println(this.pages.length);
    }



}
