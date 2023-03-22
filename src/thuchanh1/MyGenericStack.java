package thuchanh1;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.StringJoiner;

import static javafx.beans.binding.Bindings.isEmpty;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList<T>();
    }
    public void push(T element){
        stack.addFirst(element);
    }
    public T pop(){
    if (isEmpty()) throw new EmptyStackException();
    else return stack.removeFirst();
    }
    public int size(){
        return stack.size();
    }
    public boolean isEmpty(){
        if (stack.size() == 0)
            return true;
        else return false;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MyGenericStack.class.getSimpleName() + "[", "]")
                .add("stack=" + stack)
                .toString();
    }
}
