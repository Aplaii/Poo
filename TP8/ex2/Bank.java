package TP8.ex2;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private int nb;
    private Map<Integer, Account> accounts = new java.util.HashMap<Integer, Account>();

    public Bank(){
        this.nb = 0;
    }

    public void addAccount(Account a){
        this.accounts.put(nb+1, a);
        this.nb++;
    }

    public void Withdraw(double value, int c)throws AccountNotFoundException, InsufficientBalanceException{
        int acc = this.getAccountById(c);
        for (int i = 0; i< this.accounts.size(); i++){
            if(this.accounts.get(i).getId() == c){
                acc = i;
            }
        }
        if(acc == -1) throw new AccountNotFoundException("Compte introuvable");
        else{
            this.accounts.get(acc).Withdraw(value);
        }
    }

    private int getAccountById(int id) throws AccountNotFoundException{
        int acc = -1;
        for (int i = 0; i< this.nb; i++){
            Account tmp = accounts.get(i);
            int v = tmp.getId();
            if(v == id){
                acc = v;
            }
        }
        if(acc == -1) {throw new AccountNotFoundException("Compte introuvable");}
        else{
            return acc;
        }
    }

    public void deposit(double value, int c) throws AccountNotFoundException{
        int acc = this.getAccountById(c);
        Account client = this.accounts.get(acc);
        client.deposit(value);
        return;
    }

    public String checkAccount(int id) throws AccountNotFoundException{
        int acc = this.getAccountById(id);
        Account client = this.accounts.get(acc);
        return client.toString();
    }

    public String toString(){
        String s = "";
        for (int i = 0; i < accounts.size(); i++){
            s += "\n"+this.accounts.get(i).toString();
        }
        return s;
    }




}
