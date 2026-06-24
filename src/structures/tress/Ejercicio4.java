package structures.tress;

import structures.node.Node;

public class Ejercicio4 {

    public int maxDepth(Node<Integer> root) {

        if (root == null) {
            return 0;
        }

        int depthLeft = maxDepth(root.getLeft());
        int depthRight = maxDepth(root.getRight());
        return Math.max(depthLeft, depthRight) + 1;
    }

    public void printTree(Node<Integer> root) {
        printTreeRecursivo(root, 0);
    }

    public void printTreeRecursivo(Node<Integer> actual, int nivel) {
        if (actual == null) {
            return;
        }

        printTreeRecursivo(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i++) {
            System.out.print("      ");
        }
        System.out.println(actual);
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }

}
