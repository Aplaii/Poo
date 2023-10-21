package TP4.ex1;
import java.util.List;
import java.util.ArrayList;


public class CommercialVehicle extends Vehicle {
    private List<String> accessories = new ArrayList<>();
    private int charge;
    private boolean isAvailable;
    private int volume; 
    
    public CommercialVehicle (String m, String n, int p, List<String> a, int c, boolean _a, int vol){
        super(m, n, p);
        this.charge = c;
        this.isAvailable = _a;
        this.volume = vol;

    }

    public boolean isAvailable(){
        return this.isAvailable;
    }

    public void addAccessory(String s){
        this.accessories.add(s);
    }

    public void deposit(){
        this.isAvailable = true;
    }

    public void rent(){
        this.isAvailable = false;
    }

    public String toString(){
       StringBuilder s = new StringBuilder();
       for(String str: this.accessories){
        s.append(str + "\n");
       }
        return super.toString() + "\nCharge: "+ this.charge +"\nAvailable: "+this.isAvailable +"\nVolume: "+this.volume+"\nAccessories: "+s.toString();
    }

}
