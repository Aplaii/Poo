import java.util.List;
import java.util.ArrayList;

public class Etudiant {
    private List <Module> coursSuivis = new ArrayList<>();
    private String nom;
    private String prenom;
    private String INE;


    public List<Module> getCoursSuivis() {
        return coursSuivis;
    }

    public void register(Module cours) {
        this.coursSuivis.add(cours);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getINE() {
        return INE;
    }

    public void setINE(String iNE) {
        INE = iNE;
    }

    public Etudiant(String n, String p, String i){
        this.nom = n;
        this.prenom = p;
        this.INE = i;
    }

    public String toString(){
        return "Nom: "+this.nom+"\nPrenom: "+this.prenom+"\nINE: "+this.INE+"\n Cours suivis: "+this.coursSuivis.toString();
    }

    public boolean equals(Etudiant o){
        return ((this.INE == o.getINE()) && (this.nom == o.getNom()) && (this.prenom == o.getPrenom()));
    }

    public float Moyenne(){
        float m = 0;
        int nb = 0;
        for(int i = 0; i < coursSuivis.size(); i++){
            float eIndex = coursSuivis.get(i).getNote(this);
            if(eIndex == -1){}
            else{
                m += eIndex;
                nb++;
            }
        }
        if(nb > 0){
            return (m/nb);
        }
        return -1;
    }





}
