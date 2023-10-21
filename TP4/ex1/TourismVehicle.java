package TP4.ex1;

public class TourismVehicle extends Vehicle {
    private int doors;
    private boolean isAvailable;
    private int seats;

    public TourismVehicle(String m, String n, int p, int d, boolean _a, int s){
        super(m, n, p);
        this.doors = d;
        this.isAvailable = _a;
        this.seats = s;
    }

    public void deposit(){
        this.isAvailable = true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }

    public void rent(){
        this.isAvailable = false;
    }

    public String toString(){
        return super.toString() + "\nDoors: "+this.doors+"\nAvailable: "+this.isAvailable+"\nSeats: "+this.seats;
    }



}
