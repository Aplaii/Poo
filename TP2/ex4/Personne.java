package TP2.ex4;

public class Personne {

    private String name;

    public Personne (String n){
        this.name = n;
    }

    public void affiche(){
        System.out.println("Nom: "+this.name);
    }

}
