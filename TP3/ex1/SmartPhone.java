package TP3.ex1;

public class SmartPhone extends FeaturePhone {
    boolean _gps;
    boolean _photo;
    String os;
    
    public SmartPhone (String marque, String modele, double num, String ope, String o, boolean g, boolean p){
        super(marque, modele, num, ope);
        this._gps = g;
        this._photo = p;
        this.os = o;
    }

    public String toString(){
        return super.toString() +"\nGPS: "+this._gps +"\nPhoto: "+this._photo+"\nOs: "+this.os;
    }

    public void affiche(){
        super.affiche();
        System.out.println(this.toString());
    }

}
