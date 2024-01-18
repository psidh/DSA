import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode parent;
    List<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.parent = null;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        child.parent = this;
        this.children.add(child);
    }
}

public class RootedTree {
    TreeNode root;

    public RootedTree(int data) {
        this.root = new TreeNode(data);
    }

    public static void main(String[] args) {
        RootedTree tree = new RootedTree(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);

        tree.root.addChild(node2);
        tree.root.addChild(node3);

        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);

        node2.addChild(node4);
        node2.addChild(node5);

        // You can perform operations on the tree here
    }
}
