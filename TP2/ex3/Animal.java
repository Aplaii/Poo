package TP2.ex3;

public abstract class Animal {
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

    public abstract void setNoise(String n);
}

