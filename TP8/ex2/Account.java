package TP8.ex2;

public class Account{
    private double balance;
    private int id;

    public Account(int id){
        this.id = id;
        this.balance = 0;
    }

    public void deposit(double amount){
        if(amount <= 0){return;}
        this.balance += amount;
    }

    public double getBalance(){
        return this.balance;
    }

    public String toString(){
        return "<"+this.id+":"+this.balance+">";
    }

    public void Withdraw(double value) throws InsufficientBalanceException{
        if(balance < value) throw new InsufficientBalanceException("Fonds insuffisants");
        else{this.balance -= value;}
        
    }

    public int getId(){
        return this.id;
    }
}
