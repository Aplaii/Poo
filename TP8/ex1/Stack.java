package TP8.ex1;

import java.util.EmptyStackException;

public interface Stack {
    boolean empty();

    void push(Value value);
    Value pop() throws EmptyStackException, TP8.ex1.EmptyStackException;
    Value peek() throws EmptyStackException, TP8.ex1.EmptyStackException;


}
