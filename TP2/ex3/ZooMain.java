package TP2.ex3;

public class ZooMain {
    static Animal [] zoo = new Animal[3];
    public static void main (String [] args){

        Animal Chien = new Chien("Arnold", "Rouge", 5);
        Animal Chat1 = new Chat("Alfred", "Orange", 2);
        Animal Chat2 = new Chat("Baptiste", "Noir", 10);

      zoo[0] = Chien;
      zoo[1] = Chat1;
      zoo[2] = Chat2;
         
        

        for (int i = 0; i< zoo.length; i++){
            System.out.println(zoo[i]);
            System.out.println("\n---\n");
        }
    }

}
