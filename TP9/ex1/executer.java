package ex1;

public class executer{
    public static void main(String [] args){

        Voitures v = new Voitures("Kia", "Sport", "XX-123-YY", 2, false);

        System.out.println(v);

        Gestion g = new Gestion();

        System.err.println(g.nonAssure());

    }
}