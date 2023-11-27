package ex3;

import java.util.ArrayList;

public abstract class Ressource {
    protected String url;
    protected Statut statut;
    protected double duree;
    protected ArrayList<Etudiant> etu = new ArrayList<Etudiant>();

    public Ressource(String url){
        this.url = url;
        this.statut = Statut.NON_CONSULTEE;
        this.duree = 3600;
    }

    public void setStatut(Statut s){
        this.statut = s;
    }

    public void setDuree(double d){
        this.duree = d;
    }

    public void AddEtu(Etudiant e){
        e.rejoindre(this);
        this.etu.add(e);

    }

}
