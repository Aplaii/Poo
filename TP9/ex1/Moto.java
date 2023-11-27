package ex1;
public class Moto extends Vehicle{
    protected String marque;
    protected String modele;
    protected String imat;
    protected String ida;
    protected boolean cylindre;

    public Moto(String m, String mod, String imat, boolean c){
        super(m, mod, imat);
        this.cylindre = c;
    }

    public String toString(){
        String l = super.toString();
        if(this.cylindre){
            return l + "\nEst une cylindrée";
        }
        return l + "\n N'est pas une cylindrée";
    }

}
