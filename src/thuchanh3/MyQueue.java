package thuchanh3;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        if (currentSize == capacity)
            return true;
        else return false;
    }

    public boolean isQueueEmpty() {
        if (currentSize == 0)
            return true;
        else return false;
    }

    public void enqueue(int element) {
        if (isQueueFull())
            System.out.println("overflow ! unable to add element" + element);
        else tail++;
        if (tail == capacity - 1)
            tail = 0;
        else queueArr[tail] = element;
        currentSize++;
        System.out.println("element " + element + " is pushed to queue!");
    }

    public void dequeue() {
        if (isQueueEmpty()) {
            System.out.println("underflow! unable to remove element from queue");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }

            currentSize--;
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", MyQueue.class.getSimpleName() + "[", "]")
                .add("capacity=" + capacity)
                .add("queueArr=" + Arrays.toString(queueArr))
                .add("head=" + head)
                .add("tail=" + tail)
                .add("currentSize=" + currentSize)
                .toString();
    }
}
