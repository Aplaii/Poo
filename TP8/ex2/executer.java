package TP8.ex2;

public class executer {
    public static void main(String [] args) throws AccountNotFoundException{
        Bank b = new Bank();

        Client c1 = new Client(1, "Clement", "1");
        Client c2 = new Client(2, "Leo ", "F");

        Account a1 = new Account(1);
        Account a2 = new Account(2);

        b.addAccount(a1);
        b.addAccount(a2);

        System.out.println(b);

        c1.deposit(100, 1);
        System.out.println(c1);
        

    }
}
