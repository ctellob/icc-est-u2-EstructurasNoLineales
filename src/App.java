import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import collections.maps.Maps;
import collections.set.Sets;
import models.Contacto;
import models.Persona;
import structures.node.Node;
import structures.tress.Binary;
import structures.tress.Ejercicio1;
import structures.tress.Ejercicio2;
import structures.tress.Ejercicio3;
import structures.tress.Ejercicio4;
import structures.tress.intTree;

public class App {
    public static void main(String[] args) throws Exception {
        // runIntTree();
        runBinaryTree();
        runEjercicios();
        runSets();
    }

    private static void runSets() {
        Sets sets = new Sets();
        // Implementacion -> HashSet hashcode
        System.out.println("* HashCode: ");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Size= " + hashSet.size());

        System.out.println("-------------------------------------------------------------");

        // Implementacion -> LinkedHashSet hashcode
        System.out.println("* LinkedHashCode: ");
        Set<String> lSet = sets.construirLinkedHashSet();
        System.out.println(lSet);
        System.out.println("Size= " + lSet.size());

        System.out.println("-------------------------------------------------------------");

        // Implementacion -> TreeSet hashcode
        System.out.println("* TreeSet: ");
        Set<String> TreeSet = sets.construirTreeSet();
        System.out.println(TreeSet);
        System.out.println("Size= " + TreeSet.size());

        System.out.println("-------------------------------------------------------------");

        // Implementacion -> Hash Contact Set hashcode
        System.out.println("* Hash Contact Set: ");
        Set<Contacto> tSet = sets.construirHashSetContacto();
        System.out.println(tSet);
        System.out.println("Size= " + tSet.size());

        System.out.println("-------------------------------------------------------------");

        // Implementacion -> Tree Contact Set hashcode
        System.out.println("* Tree Contact Set: ");
        Set<Contacto> tCSet = sets.construirTreeSetContacto();
        System.out.println(tCSet);
        System.out.println("Size= " + tCSet.size());

        System.out.println("-------------------------------------------------------------");
        System.out.println("* Hash Map: ");
        Maps maps = new Maps();
        maps.construirHashMap();
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

        Ejercicio4 ejercicio4 = new Ejercicio4();
        Binary<Integer> treeEj4 = new Binary<>();
        int[] valoresEj4 = new int[] { 4, 2, 7, 1, 3, 6, 9 };
        for (int numero : valoresEj4) {
            treeEj4.add(numero);
        }

        Node<Integer> root = tree.getRoot();

        System.out.println("\n--- Ejercicio 1 ---");
        ejercicio1.insert(numeros);

        System.out.println("\n--- Ejercicio 2 ---");
        ejercicio2.inverTree(root);

        System.out.println("\n--- Ejercicio 3 ---");
        ejercicio3.printTree(treeEj3.getRoot());
        System.out.println("Resultado de Listar Niveles:");
        ejercicio3.printLevels(niveles);

        System.out.println("\n--- Ejercicio 4 ---");

        treeEj4.getRoot().getLeft().getLeft().setLeft(new Node<>(8));

        int profundidad = ejercicio4.maxDepth(treeEj4.getRoot());

        System.out.println("\nProfundidad Máxima: " + profundidad);
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