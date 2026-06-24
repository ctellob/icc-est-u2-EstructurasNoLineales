package structures.tress;

import structures.node.Node;

public class Ejercicio2 {

    public void inverTree(Node<Integer> root) {
        System.out.println("Arbol original");
        printTree(root);
        inverTreeRecursivo(root);
        System.out.println("Arbol Invertido");
        printTree(root);
    }

    public void inverTreeRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return;
        }
        Node<Integer> left = actual.getLeft();
        Node<Integer> right = actual.getRight();
        actual.setLeft(right);
        actual.setRight(left);
        inverTreeRecursivo(actual.getLeft());
        inverTreeRecursivo(actual.getRight());
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
