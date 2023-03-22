package thuchanh4;

public class Main {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(7);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
