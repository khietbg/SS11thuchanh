package thuchanh3;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(6);
        queue.enqueue(5);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(89);
        System.out.println(queue);
    }
}
