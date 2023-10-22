enum Color {
    RED,
    BLACK
}

class Node {
    int data;
    Color color;
    Node parent, left, right;

    public Node(int data) {
        this.data = data;
        this.color = Color.RED;
        this.parent = this.left = this.right = null;
    }
}

public class RedBlackTree {
    private Node root;
    private Node nil; // Sentinel node

    public RedBlackTree() {
        nil = new Node(-1);
        nil.color = Color.BLACK;
        root = nil;
    }

    // Left Rotate
    private void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;

        if (y.left != nil) {
            y.left.parent = x;
        }

        y.parent = x.parent;

        if (x.parent == nil) {
            root = y;
        } else if (x == x.parent.left) {
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }

        y.left = x;
        x.parent = y;
    }

    // Right Rotate
    private void rightRotate(Node y) {
        Node x = y.left;
        y.left = x.right;

        if (x.right != nil) {
            x.right.parent = y;
        }

        x.parent = y.parent;

        if (y.parent == nil) {
            root = x;
        } else if (y == y.parent.right) {
            y.parent.right = x;
        } else {
            y.parent.left = x;
        }

        x.right = y;
        y.parent = x;
    }

    // Insert a key into the Red-Black Tree
    public void insert(int key) {
        Node z = new Node(key);
        Node y = nil;
        Node x = root;

        while (x != nil) {
            y = x;
            if (z.data < x.data) {
                x = x.left;
            } else {
                x = x.right;
            }
        }

        z.parent = y;

        if (y == nil) {
            root = z;
        } else if (z.data < y.data) {
            y.left = z;
        } else {
            y.right = z;
        }

        z.left = nil;
        z.right = nil;
        z.color = Color.RED;

        insertFixup(z);
    }

    // Fix the Red-Black Tree properties after insertion
    private void insertFixup(Node z) {
        while (z.parent.color == Color.RED) {
            if (z.parent == z.parent.parent.left) {
                Node y = z.parent.parent.right;
                if (y.color == Color.RED) {
                    z.parent.color = Color.BLACK;
                    y.color = Color.BLACK;
                    z.parent.parent.color = Color.RED;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.right) {
                        z = z.parent;
                        leftRotate(z);
                    }
                    z.parent.color = Color.BLACK;
                    z.parent.parent.color = Color.RED;
                    rightRotate(z.parent.parent);
                }
            } else {
                Node y = z.parent.parent.left;
                if (y.color == Color.RED) {
                    z.parent.color = Color.BLACK;
                    y.color = Color.BLACK;
                    z.parent.parent.color = Color.RED;
                    z = z.parent.parent;
                } else {
                    if (z == z.parent.left) {
                        z = z.parent;
                        rightRotate(z);
                    }
                    z.parent.color = Color.BLACK;
                    z.parent.parent.color = Color.RED;
                    leftRotate(z.parent.parent);
                }
            }
        }
        root.color = Color.BLACK;
    }

    // Search for a key in the Red-Black Tree
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(Node root, int key) {
        if (root == nil || root.data == key) {
            return root != nil;
        }

        if (key < root.data) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }

    // Perform in-order traversal of the Red-Black Tree
    public void inOrderTraversal() {
        inOrderTraversalRec(root);
        System.out.println();
    }

    private void inOrderTraversalRec(Node root) {
        if (root != nil) {
            inOrderTraversalRec(root.left);
            System.out.print("(" + root.data + ", " + root.color + ") ");
            inOrderTraversalRec(root.right);
        }
    }

    public static void main(String[] args) {
        RedBlackTree rbTree = new RedBlackTree();

        // Insert key-values
        int[] keys = {7, 3, 18, 10, 22, 8, 11, 26, 2, 6, 13};
        for (int key : keys) {
            rbTree.insert(key);
        }

        // Display the Red-Black Tree
        System.out.println("In-order traversal of the Red-Black Tree:");
        rbTree.inOrderTraversal();

        // Search for keys
        int keyToSearch = 10;
        System.out.println("Is " + keyToSearch + " present in the Red-Black Tree? " + rbTree.search(keyToSearch));

        int keyToRemove = 18;
        System.out.println("Removing " + keyToRemove + " from the Red-Black Tree.");
        // (You can implement the remove method following Red-Black Tree deletion rules)

        // Display the Red-Black Tree after removal
        System.out.println("In-order traversal after removal:");
        rbTree.inOrderTraversal();
    }
}
