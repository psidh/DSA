class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListOperations {
    Node head;

    // Insert a node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Delete a node with a given key
    public void delete(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return; // Key not found
        }

        prev.next = current.next;
    }

    // Update the value of a node with a given key
    public void update(int key, int newValue) {
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                current.data = newValue;
                return;
            }
            current = current.next;
        }
    }

    // Display the linked list
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListOperations list = new LinkedListOperations();
        
        // Insert nodes
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // Display the linked list
        list.display();

        // Update a node
        list.update(2, 5);
        list.display();

        // Delete a node
        list.delete(3);
        list.display();
    }
}
