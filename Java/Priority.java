import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.add(12);
        priorityQueue.add(6);
        priorityQueue.add(9);
        priorityQueue.add(3);
        priorityQueue.add(15);

        System.out.println("Priority Queue: " + priorityQueue);

        // Removing elements from the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removed: " + priorityQueue.poll());
        }
    }
}
