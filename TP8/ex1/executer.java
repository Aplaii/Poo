package TP8.ex1;

public class executer {
    public static void main(String [] args) throws EmptyStackException{
        LifoStack p = new LifoStack();

        Value v1 = new Value("a", 3);
        p.push(v1);
        System.out.println(p.peek());
        p.pop();
        System.out.println(p.empty());
        System.out.println(p.peek());


    }
}
