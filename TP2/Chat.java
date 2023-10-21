package TP2;

public class Chat extends Animal {
    private String noise = "miaulement";
    public Chat(String n, String r, int a){
        super(n, r, a);
        super.setNoise(noise);
    }
}
