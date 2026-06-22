import models.Persona;
import structures.node.Node;
import structures.tress.Binary;
import structures.tress.Ejercicio1;
import structures.tress.Ejercicio2;
import structures.tress.intTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
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

        Node<Integer> root = tree.getRoot();
        ejercicio1.insert(numeros);

        ejercicio2.inverTree(root);
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