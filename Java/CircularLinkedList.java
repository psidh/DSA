class CircularNode {
    int data;
    CircularNode next;

    public CircularNode(int data) {
        this.data = data;
        this.next = this;
    }
}

public class CircularLinkedList {
    CircularNode head;

    // Insert a node at the end of the circular linked list
    public void insert(int data) {
        CircularNode newNode = new CircularNode(data);

        if (head == null) {
            head = newNode;
        } else {
            CircularNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newNode;
            newNode.next = head;
        }
    }

    // Delete a node with a given key
    public void delete(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            if (head.next == head) {
                head = null;
            } else {
                CircularNode tail = head;
                while (tail.next != head) {
                    tail = tail.next;
                }
                head = head.next;
                tail.next = head;
            }
            return;
        }

        CircularNode current = head;
        CircularNode prev = null;

        while (current.next != head) {
            if (current.data == key) {
                prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }

        if (current.data == key) {
            prev.next = head;
        }
    }

    // Update the value of a node with a given key
    public void update(int key, int newValue) {
        CircularNode current = head;

        do {
            if (current.data == key) {
                current.data = newValue;
                return;
            }
            current = current.next;
        } while (current != head);
    }

    // Display the circular linked list
    public void display() {
        CircularNode current = head;

        if (head == null) {
            System.out.println("Empty Circular Linked List");
            return;
        }

        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println(head.data); // Print head again to indicate the circular structure
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Insert nodes
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // Display the circular linked list
        list.display();

        // Update a node
        list.update(2, 5);
        list.display();

        // Delete a node
        list.delete(3);
        list.display();
    }
}
