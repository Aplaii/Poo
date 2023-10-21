package TP3.ex2;

public class Page {
    private String verso;
    private String recto;

    private String active;

    public Page (String r, String v){
        this.recto = r;
        this.verso = v;
        this.active = recto;
        this.greenThreshold(0);
    }

    public String toString(){
        return this.active;
    }

    public void flip(){
        if(active == verso){
            active = recto;
        }
        else{
            active = verso;
        }
    }

    public void greenThreshold(int threshold){
        System.out.println("Halte au gaspillage !_");
    }

}
