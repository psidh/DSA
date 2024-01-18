import java.util.LinkedList;

class KeyValuePair {
    String key;
    int value;

    public KeyValuePair(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class HashTable {
    private static final int TABLE_SIZE = 10;
    private LinkedList<KeyValuePair>[] table;

    public HashTable() {
        table = new LinkedList[TABLE_SIZE];
        for (int i = 0; i < TABLE_SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function
    private int hash(String key) {
        int hash = key.hashCode() % TABLE_SIZE;
        return (hash < 0) ? (hash + TABLE_SIZE) : hash;
    }

    // Insert a key-value pair into the hash table
    public void insert(String key, int value) {
        int index = hash(key);
        LinkedList<KeyValuePair> list = table[index];

        // Check if the key already exists, and update the value if so
        for (KeyValuePair pair : list) {
            if (pair.key.equals(key)) {
                pair.value = value;
                return;
            }
        }

        // Add a new key-value pair to the list
        list.add(new KeyValuePair(key, value));
    }

    // Retrieve the value associated with a key
    public int get(String key) {
        int index = hash(key);
        LinkedList<KeyValuePair> list = table[index];

        // Search for the key in the list
        for (KeyValuePair pair : list) {
            if (pair.key.equals(key)) {
                return pair.value;
            }
        }

        // Key not found
        return -1;
    }

    // Remove a key-value pair from the hash table
    public void remove(String key) {
        int index = hash(key);
        LinkedList<KeyValuePair> list = table[index];

        // Search for the key in the list and remove it
        list.removeIf(pair -> pair.key.equals(key));
    }

    // Display the contents of the hash table
    public void display() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print("Index " + i + ": ");
            LinkedList<KeyValuePair> list = table[i];
            for (KeyValuePair pair : list) {
                System.out.print("(" + pair.key + ", " + pair.value + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        // Insert key-value pairs
        hashTable.insert("John", 25);
        hashTable.insert("Alice", 30);
        hashTable.insert("Bob", 22);

        // Display the initial hash table
        System.out.println("Initial Hash Table:");
        hashTable.display();

        // Retrieve and display values
        System.out.println("\nValue for key 'Alice': " + hashTable.get("Alice"));
        System.out.println("Value for key 'Charlie': " + hashTable.get("Charlie"));

        // Update the value for an existing key
        hashTable.insert("John", 26);

        // Remove a key-value pair
        hashTable.remove("Alice");

        // Display the updated hash table
        System.out.println("\nUpdated Hash Table:");
        hashTable.display();
    }
}
