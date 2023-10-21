package TP4.ex2;
import java.util.List;
import java.util.ArrayList;

public class RentalAgency {
    private String address;
    private int maxVehicles;
    private List <Vehicle> vehicles = new ArrayList<>();

    public RentalAgency(String a, int mv){
        this.address = a;
        this.maxVehicles = mv;
    }

    public String getAddress(){
        return this.address;
    }

    public void addVehicle(Vehicle v){
        if(maxVehicles == vehicles.size()){return;}
        for (Vehicle a: vehicles){
            if(a.getNumberPlate() == v.getNumberPlate()){
                return;
            }
        }
        this.vehicles.add(v);
    }

    public void finAllVehicle(){
        for (Vehicle v : vehicles){
            System.out.println(v);
        }
    }

    public void finAllVehicleByClientType(ClientType c){ 

        if(c.getType() == "Professional"){
            for(Vehicle a : vehicles){
                if(a instanceof CommercialVehicle){
                    System.out.println(a);
                }
            }
        }
        else{
            for(Vehicle a : vehicles){
                if(a instanceof TourismVehicle){
                    System.out.println(a);
                }
            }
        }
        

    }


}
