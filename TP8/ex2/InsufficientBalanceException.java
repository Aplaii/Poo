package TP8.ex2;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(){
        super();
    }
    public InsufficientBalanceException(String s){
        super(s);
    }
}
