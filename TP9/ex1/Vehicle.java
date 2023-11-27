package ex1;


public abstract class Vehicle{
    protected String marque;
    protected String modele;
    protected String imat;
    protected String ida;

    Vehicle(String m, String mod, String imat){
        this.marque = m;
        this.modele = mod;
        this.imat = imat;
        this.ida = null;
    }

    public String toString(){
        String l = "Marque: "+this.marque+"\nModele: "+this.modele+"\nImatriculation: "+this.imat+"\nID Assurance: ";
        if(this.ida == null){
            return l + "Non assuré";
        }
        return l + this.ida;
    }

    public void assurer(String id){
        this.ida = id;
    }

}