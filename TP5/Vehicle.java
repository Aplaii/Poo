package TP5;

public class Vehicle extends Property{
    private int nbOfPlaces;
    private String registrationNumber;


    public Vehicle(int v, int c, int n, String r){
        super(v, c);
        this.nbOfPlaces = n;
        this.registrationNumber = r;
    }

    public int getNbOfPlaces() {
        return nbOfPlaces;
    }

    public void setNbOfPlaces(int nbOfPlaces) {
        this.nbOfPlaces = nbOfPlaces;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }    

    public String toString(){
        return super.toString() +"\nNumber of seats: "+this.nbOfPlaces + "\nRegistration number: "+this.registrationNumber;
    }

    public void getDetails(){
        return;
    }

}
