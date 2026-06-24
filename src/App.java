import java.util.List;

import models.Persona;
import structures.node.Node;
import structures.tress.Binary;
import structures.tress.Ejercicio1;
import structures.tress.Ejercicio2;
import structures.tress.Ejercicio3;
import structures.tress.intTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        runBinaryTree();
        runEjercicios();

    }

    private static void runEjercicios() {

        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        for (int numero : numeros) {
            System.out.println(numero);
        }

        Ejercicio2 ejercicio2 = new Ejercicio2();
        int[] numeros2 = new int[] { 5, 3, 7, 2, 4, 6, 8 };
        Binary<Integer> tree = new Binary<>();
        for (int numero : numeros2) {
            tree.add(numero);
        }

        Ejercicio3 ejercicio3 = new Ejercicio3();
        int[] valoresEj3 = new int[] { 4, 2, 7, 1, 3, 6, 9 };
        Binary<Integer> treeEj3 = new Binary<>();
        for (int numero : valoresEj3) {
            treeEj3.add(numero);
        }

        List<List<Node<Integer>>> niveles = ejercicio3.listLevels(treeEj3.getRoot());
        System.out.println("Resultado de Listar Niveles:");

        Node<Integer> root = tree.getRoot();

        System.out.println("\n--- Ejecutando Ejercicio 1 ---");
        ejercicio1.insert(numeros);

        System.out.println("\n--- Ejecutando Ejercicio 2 ---");
        ejercicio2.inverTree(root);

        System.out.println("\n--- Ejecutando Ejercicio 3 ---");
        ejercicio3.printLevels(niveles);

    }

    private static void runBinaryTree() {
        Binary<String> arbolStrings = new Binary<>();
        Binary<Persona> arbolPersonas = new Binary<>();
        arbolPersonas.add(new Persona("Pablo", 30));
        arbolPersonas.add(new Persona("Ana", 25));
        arbolPersonas.add(new Persona("Luis", 35));
        arbolPersonas.add(new Persona("Maria", 28));

    }

    public static void runIntTree() {

        intTree arbolNumero = new intTree();
        // Node<Integer> nodo1 = new Node<>(50);
        // Node<Integer> nodo2 = new Node<>(10);
        // Node<Integer> nodo3 = new Node<>(30);

        // arbolNumero.setRoot(nodo1);
        // nodo1.setRight(nodo2);
        // nodo2.setLeft(nodo3);

        // System.out.println(arbolNumero.getRoot());
        // System.out.println(arbolNumero.getRoot().getRight());
        // System.out.println(arbolNumero.getRoot().getLeft());

        arbolNumero.add(50);
        arbolNumero.add(10);
        arbolNumero.add(30);

        // nodo3.setLeft(nodo1);

        System.out.println("Preorden:");
        arbolNumero.preOrden();

        System.out.println("Inorden:");
        arbolNumero.inOrden();

        System.out.println("Postorden:");
        arbolNumero.posOrden();

        System.out.println("Altura de Arbol: " + arbolNumero.getHeight());

        System.out.println("Peso del Arbol:" + arbolNumero.getPeso());

    }
}