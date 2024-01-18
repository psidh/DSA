import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Add elements to the front of the deque
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        // Add elements to the end of the deque
        deque.addLast(4);
        deque.addLast(5);

        // Remove and display elements from the front
        while (!deque.isEmpty()) {
            System.out.println("Removed from Front: " + deque.removeFirst());
        }
    }
}
