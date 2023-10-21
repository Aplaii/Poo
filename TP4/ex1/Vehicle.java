package TP4.ex1;

public class Vehicle {
    private String make;
    private String numberPlate;
    private int power;

    public Vehicle(String m, String n, int p){
        this.make = m;
        this.numberPlate = n;
        this.power = p;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getNumberPlate() {
        return numberPlate;
    }
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    
    public String toString(){
        return "Make: "+this.make+"\nNumberPlate: "+this.numberPlate+"\nPower"+this.power;
    }
}
