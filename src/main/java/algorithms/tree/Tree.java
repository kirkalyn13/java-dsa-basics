package algorithms.tree;

public class Tree {
    int data;
    Tree left;
    Tree right;

    Tree(int data, Tree left, Tree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    Tree(int data) {
        this.data = data;
    }

    public static void traverseInOrder(Tree root) {
        if (root.left != null ) traverseInOrder(root.left);
        System.out.println(root.data);
        if (root.right != null ) traverseInOrder(root.right);
    }

    public static void traversePostOrder(Tree root) {
        if (root.left != null ) traversePostOrder(root.left);
        if (root.right != null ) traversePostOrder(root.right);
        System.out.println(root.data);
    }

    public static void traversePreOrder(Tree root) {
        System.out.println(root.data);
        if (root.left != null ) traversePreOrder(root.left);
        if (root.right != null ) traversePreOrder(root.right);
    }


}
