import java.util.Random;

public class UniformHashingDemo {
    public static void main(String[] args) {
        int tableSize = 10; // Size of the hash table
        int numKeys = 20;   // Number of keys to insert
        int[] hashTable = new int[tableSize];

        // Initialize the hash table with -1 (indicating an empty slot)
        for (int i = 0; i < tableSize; i++) {
            hashTable[i] = -1;
        }

        Random random = new Random();

        // Insert keys into the hash table
        for (int i = 0; i < numKeys; i++) {
            int key = random.nextInt(100); // Generate a random key (0 to 99)
            int index = hash(key, tableSize); // Hash the key to get an index

            // Linear probing to handle collisions (if the slot is occupied, look for the next available slot)
            while (hashTable[index] != -1) {
                index = (index + 1) % tableSize;
            }

            // Insert the key into the hash table
            hashTable[index] = key;
        }

        // Print the contents of the hash table
        for (int i = 0; i < tableSize; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
        }
    }

    // Simple hash function (modulus)
    private static int hash(int key, int tableSize) {
        return key % tableSize;
    }
}
