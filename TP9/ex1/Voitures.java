package ex1;
public class Voitures extends Vehicle {
    protected String marque;
    protected String modele;
    protected String imat;
    protected String ida;
    protected int places;
    protected boolean verte;

    public Voitures(String m, String mod, String imat, int nb, boolean v){
        super(m, mod, imat);
        this.places = nb;
        this.verte = v;
    }

    public String toString(){
        String l = super.toString() + "\nNombre places: "+this.places;

        if(this.verte){
            return l + "\nCe véhicle roule à l'énergie verte";
        }
        return l + "\nCe véhicle ne roule pas à l'énergie verte";
    }

}
