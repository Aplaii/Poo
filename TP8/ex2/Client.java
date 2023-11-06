package TP8.ex2;

public class Client extends Bank{
    private String firstname;
    private String lastname;
    private int id;
    Client(int id, String f, String l){
        this.id = id;
        this.firstname = f;
        this.lastname = l;
    }

    public void deposit(double v) throws AccountNotFoundException{
        if(v <= 0){return;}
        super.deposit(v, this.id);
    }

    public void Withdraw(double v) throws InsufficientBalanceException, AccountNotFoundException{
        super.Withdraw(v, this.id);
    }

    public int getId(){
        return this.id;
    }

    public String toString(){
        return "<"+this.firstname+";"+this.lastname+":"+this.id+">";
    }

}
