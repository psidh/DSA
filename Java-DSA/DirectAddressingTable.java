public class DirectAddressingTable {
    private int[] table;

    public DirectAddressingTable(int size) {
        this.table = new int[size];
    }

    public void insert(int key, int value) {
        if (key >= 0 && key < table.length) {
            table[key] = value;
        }
    }

    public int search(int key) {
        if (key >= 0 && key < table.length) {
            return table[key];
        }
        return -1; // Key not found
    }

    public void delete(int key) {
        if (key >= 0 && key < table.length) {
            table[key] = 0;
        }
    }

    public static void main(String[] args) {
        DirectAddressingTable table = new DirectAddressingTable(100);

        table.insert(5, 42);
        table.insert(10, 99);

        System.out.println("Value at key 5: " + table.search(5));
        System.out.println("Value at key 10: " + table.search(10));

        table.delete(5);
        System.out.println("Value at key 5 after delete: " + table.search(5));
    }
}
