package TP8.ex2;

public class AccountNotFoundException extends Exception {
    AccountNotFoundException(String s){
        super(s);
    }
    AccountNotFoundException(){
        super();
    }
}
