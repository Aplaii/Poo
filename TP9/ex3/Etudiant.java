package ex3;

import java.util.ArrayList;


public class Etudiant {
    ArrayList<Ressource> ressources = new ArrayList<Ressource>();
    protected String nom;
    protected int num; 

    Etudiant(String nom, int n){
        this.nom = nom;
        this.num = n;
    }

    public void rejoindre(Ressource r){
        this.ressources.add(r);
    }

    public String toString(){
        String l = "Nom: "+this.nom+"\nNum etu: "+this.num;

        if(ressources.size()>0){
            return l + "\n"+ressources.toString();
        }
        return l + "\nInscrit à aucun cours";        
    }
}
