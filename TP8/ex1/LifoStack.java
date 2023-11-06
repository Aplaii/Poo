package TP8.ex1;
import java.util.List;
import java.util.ArrayList;

public class LifoStack implements Stack {
    
    private List<Value> Pile = new ArrayList<Value>();


    LifoStack(){

    }


    public boolean empty(){
        return this.Pile.size() == 0;
    }

    public void push(Value value){
        try{
            this.Pile.add(value);
        }finally{};
    }

    public Value pop() throws EmptyStackException{
        if(this.empty())throw new EmptyStackException("Pile vide");
        else{
            Value r = this.Pile.get(0);
            this.Pile.remove(0);
            return r;
        }
        
    }

    public Value peek() throws EmptyStackException{
        if(this.empty()) throw new EmptyStackException("Pile vide");
        else{
            return this.Pile.get(0);
            }
    }


}
