package TP2;

public class Chien extends Animal {
    private String noise = "Aboiement";
    public Chien(String n, String r, int a){
        super(n, r, a);
        super.setNoise(noise);
    }


}