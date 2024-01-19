public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BinaryTreeTraversal {
    // In-order traversal: Left, Root, Right
    public void inOrderTraversal(TreeNode root) {
        if (root != null) {
            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
        }
    }

    // Pre-order traversal: Root, Left, Right
    public void preOrderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    // Post-order traversal: Left, Right, Root
    public void postOrderTraversal(TreeNode root) {
        if (root != null) {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        // Example usage:
        TreeNode root = new TreeNode(1,new TreeNode(2, new TreeNode(4), new TreeNode(5)),new TreeNode(3));

        BinaryTreeTraversal traversal = new BinaryTreeTraversal();
        
        System.out.println("In-order traversal:");
        traversal.inOrderTraversal(root);

        System.out.println("\nPre-order traversal:");
        traversal.preOrderTraversal(root);

        System.out.println("\nPost-order traversal:");
        traversal.postOrderTraversal(root);
    }
}
