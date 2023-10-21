package TP2;

public class Animal {
    private String nom;
    private String noise;
    private String race;
    private int age;

    public Animal(String n, String r, int a){
        this.nom = n;
        this.race = r;
        this.age = a;
    }


    public String toString(){
        return "Nom: "+this.nom+"\nRace: "+this.race+"\nAge: "+this.age+"\nBruit: "+this.noise;
    }

    public void setNoise(String n){
        this.noise = n;;
    }
}

