package TP3.ex1;

public class FeaturePhone {
    private String marque;
    private String modele;
    private double numero;
    private String operateur;
    private boolean estBloque;

    public String getModele(){
        return this.modele;
    }

    public String getMarque(){
        return this.marque;
    }

    public FeaturePhone (String marque, String modele, double num, String ope){
        this.estBloque = true;
        this.marque = marque;
        this.modele = modele;
        this.numero = num;
        this.operateur = ope;
    }

    public String toString(){
        return "Marque: "+this.marque+"\nNuméro: "+this.numero+"\nModele: "+this.modele+"\nOpérateur: "+this.operateur+"\nBloqué: "+this.estBloque;
    }

    public void affiche(){
        System.out.println(this.toString());
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof FeaturePhone){
            FeaturePhone tmp = (FeaturePhone) o;
            return ((this.modele == tmp.getModele()) && (this.marque == tmp.getMarque()));
        }
        return false;

    }

    public void setBloque(Boolean v){
        this.estBloque = v;
    }

    public double getNum(){
        return this.numero;
    }

}