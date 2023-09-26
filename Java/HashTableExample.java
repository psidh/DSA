import java.util.HashMap;

public class HashTableExample {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Insert key-value pairs into the hash table
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 22);

        // Access values by key
        System.out.println("Age of Alice: " + hashMap.get("Alice"));
        System.out.println("Age of Bob: " + hashMap.get("Bob"));

        // Check if a key exists
        System.out.println("Is David in the hash table? " + hashMap.containsKey("David"));

        // Remove a key-value pair
        hashMap.remove("Charlie");
        System.out.println("Age of Charlie after removal: " + hashMap.get("Charlie"));
    }
}
