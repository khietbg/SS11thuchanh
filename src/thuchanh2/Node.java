package thuchanh2;

import java.util.StringJoiner;

public class Node {
    public int key;
    public Node next;
    public Node(int key){
        this.key = key;
        this.next = null;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                .add("key=" + key)
                .add("next=" + next)
                .toString();
    }
}
