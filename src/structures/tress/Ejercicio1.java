package structures.tress;

import structures.node.Node;

public class Ejercicio1 {

    public void insert(int[] numeros) {

        // CREAR EL ARBOL DE ENTEROS
        Binary<Integer> tree = new Binary<>();
        // INSERTAR CADA NUMERP
        for (int numero : numeros) {
            tree.add(numero);
        }

        // IMPRIMIR EL ARBOL
        System.out.println("Árbol del Ejercicio 1 (InOrden):");
        tree.inOrden();
        printTree(tree.getRoot());
    }

    public void printTree(Node<Integer> root) {
        System.out.println("Impriendo el árbol:");
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
