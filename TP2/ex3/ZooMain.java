package TP2;

public class ZooMain {
    
    public static void main (String [] args){

        Animal Chien = new Chien("Arnold", "Rouge", 5);
        Animal Chat1 = new Chat("Alfred", "Orange", 2);
        Animal Chat2 = new Chat("Baptiste", "Noir", 10);

        Animal [] animals = {Chien, Chat1, Chat2};

        for (int i = 0; i< animals.length; i++){
            System.out.println(animals[i]);
            System.out.println("\n---\n");
        }
    }

}
