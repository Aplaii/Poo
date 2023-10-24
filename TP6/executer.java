
public class executer {
    public static void main(String [] args){

        Module m1 = new Module("Tremulot", "Maths");
        Module m2 = new Module("Tremulot", "Anglais");

        Etudiant e1 = new Etudiant("Bolifraud", "Clément", "1551515842DK");

        e1.register(m1);
        m1.addStudent(e1);

        m1.setNote(e1, 20);



        e1.Moyenne();
        // System.out.println(e1);
        // System.out.println(m1);


    }
}
