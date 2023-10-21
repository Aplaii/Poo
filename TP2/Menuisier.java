package TP2;

public class Menuisier extends Personne {
    public Menuisier (String n){
        super(n);
    }

    public void affiche(){
        super.affiche();
        System.out.println("Profession: Menuisier");
    }
}
