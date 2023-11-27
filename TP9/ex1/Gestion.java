package ex1;
import java.util.ArrayList;

public class Gestion {
    ArrayList<Vehicle> parc = new ArrayList<Vehicle>();
    
    public Gestion(){
        this.parc.add(new Voitures("Citroen", "C4", "xx-123-yy", 5, false));
        this.parc.add(new Voitures("Citroen", "C1", "aa-456-yy", 5, false));
        
        this.parc.add(new Moto("Kawasaki", "200cc", "AA-12-BB", true));
        this.parc.add(new Moto("Kawasaki", "800cc", ":)", true));
    

    
    }

    public ArrayList<Vehicle> nonAssure(){
        ArrayList<Vehicle> returnV = this.parc;
        
        returnV.stream().filter(v -> v.ida == null);

        return returnV;
    }

    public ArrayList<Vehicle> assurance(String a, ArrayList<Vehicle> v){
        v.stream().forEach(ve -> ve.ida = a);
        return v;
    }

}
