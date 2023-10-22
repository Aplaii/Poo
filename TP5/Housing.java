package TP5;

public class Housing extends Property{
    private int area;
    private int nbPersonnes;

    public Housing(int v, int c, int a, int n){
        super(v, c);
        this.area = a; 
        this.nbPersonnes = n;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getNbPersonnes() {
        return nbPersonnes;
    }

    public void setNbPersonnes(int nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public void getDetails(){
        return;
    }
    
    public String toString(){
        return super.toString() + "\nArea: "+this.area+"\nNombre de personnes: "+this.nbPersonnes;
    }

}
