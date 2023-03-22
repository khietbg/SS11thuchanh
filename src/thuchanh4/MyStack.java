package thuchanh4;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyStack {
    private int[] arr;
    private int size;
    private int index = 0;


    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }


    public void push(int element){
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }
    public boolean isFull(){
        if (index==size){
        return true;
        }
        return false;
    }
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }
    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        return false;
    }
    public int size(){
        return index;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MyStack.class.getSimpleName() + "[", "]")
                .add("arr=" + Arrays.toString(arr))
                .add("size=" + size)
                .add("index=" + index)
                .toString();
    }
}
