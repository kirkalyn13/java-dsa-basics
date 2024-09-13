package algorithms.tree;

public class TraverseTree {
    public static void main(String[] args) {
        Tree tree3 = new Tree(3);
        Tree tree4 = new Tree(4);
        Tree tree7 = new Tree(7);
        Tree tree8 = new Tree(8);
        Tree tree5 = new Tree(5, tree3, tree4);
        Tree tree9 = new Tree(9, tree7, tree8);
        Tree root = new Tree(10, tree5, tree9);

        System.out.println("In Order:");
        Tree.traverseInOrder(root);
        System.out.println("Post Order:");
        Tree.traversePostOrder(root);
        System.out.println("Pre Order:");
        Tree.traversePreOrder(root);
    }
}
