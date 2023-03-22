package thuchanh1;

public class Main {
    public static void main(String[] args) {
       MyGenericStack<Integer> stack = new MyGenericStack<>();


        stack.push(20);
        stack.push(11);
        stack.push(88);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        MyGenericStack<String> stack1 = new MyGenericStack<>();
        stack1.push("nam");
        stack1.push("khiet");
        stack1.push("khoa");
        System.out.println(stack1);
    }
}