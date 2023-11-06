package TP8.ex1;

public class Value {
    private final String name;
    private final int value;

    public Value(String name, int value){
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString(){
        return "<"+this.name+";"+this.value+">";    
    }

}
