package TP2;

public class Plombier extends Personne {
    public Plombier (String n){
        super(n);
    }

    public void affiche(){
        super.affiche();
        System.out.println("Profession: Plombier");
    }
}
