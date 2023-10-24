package TP2.ex3;

public class Chat extends Animal {
    public Chat(String n, String r, int a){
        super(n, r, a);
        this.setNoise("Miaulement");
    }

    public void setNoise(String n){
        final String noise = n;
    }


}
