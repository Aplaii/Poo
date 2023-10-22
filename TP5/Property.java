package TP5;

public abstract class Property {
    private int valeur;
    private int cout;

    public Property(int v, int c){
        this.cout = c;
        this.valeur = v;
    }

    public int getValue() {
        return valeur;
    }

    public void setValue(int valeur) {
        this.valeur = valeur;
    }

    public int getCostByMonth() {
        return cout;
    }

    public void setCostByMonth(int cout) {
        this.cout = cout;
    }

    public String toString(){
        return "Valeur: " +this.valeur+"\nEntretien: "+this.cout;
    }

}
