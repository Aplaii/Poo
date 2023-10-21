package TP4.ex2;

public class executer {
    public static void main(String [] args){

        RentalAgency r = new RentalAgency("1180 rue des mardelles", 14);
        

        Vehicle c1 = new CommercialVehicle("Volvo", "xx-123-zz", 150, null, 10, true, 40);
        Vehicle c2 = new CommercialVehicle("Volvo", "xx-123-za", 150, null, 10, true, 40);

        Vehicle t1 = new TourismVehicle("Citroen", "aa-123-bb", 100, 5, true, 5);
        Vehicle t2 = new TourismVehicle("Citroen", "aa-123-xb", 100, 5, true, 5);

        r.addVehicle(c1);
        r.addVehicle(c2);
        r.addVehicle(t1);
        r.addVehicle(t2);

        // r.finAllVehicle();

        ClientType a1 = new ClientType("Professional");
        ClientType a2 = new ClientType("Individual");

        r.finAllVehicleByClientType(a1);
        System.out.println("----");
        r.finAllVehicleByClientType(a2);


    }
}
