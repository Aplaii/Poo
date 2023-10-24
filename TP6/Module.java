import java.util.List;
import java.util.Map;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;


public class Module {
    private String nomModule;
    private String nomP;
    private List <Pair <Etudiant, Integer>> eleves = new ArrayList<Pair<Etudiant, Integer>>();

    public String getNom() {
        return nomModule;
    }

    public void setNom(String nomModule) {
        this.nomModule = nomModule;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public List<Pair<Etudiant, Integer>> getEleves() {
        return eleves;
    }

    public Module(String P, String n){
        this.nomModule = n;
        this.nomP = P;

    }

    public boolean existe(Etudiant p){
        System.out.println(eleves.size());
        for(int i = 0; i < eleves.size(); i++){
            System.out.println("a");
            Etudiant e = eleves.get(i).getKey();
            if(e.equals(p)){
                return true;
            }
        }
        return false;
    }

    private int getIndex(Etudiant e){
        int index = -1;
        for(int i = 0; i < eleves.size(); i++){
            if(eleves.get(i).getKey().equals(e)){
                index = i;
            }
        }
        return index;
    }

    public float getNote(Etudiant e){
        int eIndex = this.getIndex(e);
        return eleves.get(eIndex).getValue();
    }

    public void addStudent(Etudiant e){
        if(this.existe(e)){return;}
        Pair <Etudiant, Integer> m = new Pair<Etudiant,Integer>(e, -1);
        this.eleves.add(m);
    }

    public String toString(){
        return "\nNom Professeur: "+this.nomP+"\nNom Module: "+this.nomModule+"\nNom etudiants: "+this.showEleves();
    }

    /**
     * @param e
     * @param n
     */
    public void setNote(Etudiant e, int n){
        int eIndex = this.getIndex(e);
        Pair <Etudiant, Integer> s = new Pair(e, n);
        eleves.set(eIndex, s);
    }

    public String showEleves(){
        String s = "\n";
        for (int i = 0; i < eleves.size(); i++){
            s+= eleves.get(i).toString();
        }
        return s;
    }


}
