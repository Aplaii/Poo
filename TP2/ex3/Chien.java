package TP2.ex3;

public class Chien extends Animal {
    private String noise = "Aboiement";
    public Chien(String n, String r, int a){
        super(n, r, a);
        this.setNoise("Aboiement");
    }

    public void setNoise(String n){
        final String noise = n;
    }


}