package TP2.ex4;

public class Menuisier extends Personne {
    public Menuisier (String n){
        super(n);
    }

    public void affiche(){
        super.affiche();
        System.out.println("Profession: Menuisier");
    }
}
