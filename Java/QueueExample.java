import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements into the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        // Dequeue and display elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.poll());
        }
    }
}
