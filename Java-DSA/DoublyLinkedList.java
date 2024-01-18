class DoublyNode {
    int data;
    DoublyNode prev;
    DoublyNode next;

    public DoublyNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;

    // Insert a node at the end of the doubly linked list
    public void insert(int data) {
        DoublyNode newNode = new DoublyNode(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Delete a node with a given key
    public void delete(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        if (tail.data == key) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        DoublyNode current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            return; // Key not found
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    // Update the value of a node with a given key
    public void update(int key, int newValue) {
        DoublyNode current = head;

        while (current != null) {
            if (current.data == key) {
                current.data = newValue;
                return;
            }
            current = current.next;
        }
    }

    // Display the doubly linked list
    public void display() {
        DoublyNode current = head;

        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert nodes
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // Display the doubly linked list
        list.display();

        // Update a node
        list.update(2, 5);
        list.display();

        // Delete a node
        list.delete(3);
        list.display();
    }
}
