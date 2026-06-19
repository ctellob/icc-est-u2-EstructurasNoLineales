package structures.tress;

import structures.node.Node;

// CLASE DE ARBOL SOLO DE ENTEROS
public class intTree {

    private Node<Integer> root;

    // CONSTRUCTOR
    public intTree() {
        this.root = null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        this.root = node;
    }

    public void add(int value) {
        Node<Integer> node = new Node<Integer>(value);
        root = addRecursivo(root, node);
    }

    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }
        if (actual.getValue() > nodeInsertar.getValue()) {
            // IZQ
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(addRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public void preOrden() {
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return;
        }
        System.out.println(actual);
        preOrdenRecursivo(actual.getLeft());
        preOrdenRecursivo(actual.getRight());
    }

    public void posOrden() {
        posOrdenRecursivo(root);
    }

    private void posOrdenRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return;
        }
        posOrdenRecursivo(actual.getLeft());
        posOrdenRecursivo(actual.getRight());
        System.out.println(actual);
    }

    public void inOrden() {
        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Node<Integer> actual) {
        if (actual == null) {
            return;
        }
        inOrdenRecursivo(actual.getLeft());
        System.out.println(actual);
        inOrdenRecursivo(actual.getRight());
    }

    public int getHeight() {
        return getHeightRecursivo(root);
    }

    public int getHeightRecursivo(Node<Integer> heightActual) {
        if (heightActual == null) {
            return 0;
        }

        int heightLeft = getHeightRecursivo(heightActual.getLeft());
        int heightRight = getHeightRecursivo(heightActual.getRight());
        int masAlto = Math.max(heightLeft, heightRight);
        return masAlto + 1;
    }

    public int getPeso() {
        return getPesoRecursivo(root);
    }

    public int getPesoRecursivo(Node<Integer> pesoActual) {
        if (pesoActual == null) {
            return 0;
        }

        int pesoLeft = getHeightRecursivo(pesoActual.getLeft());
        int pesoRight = getHeightRecursivo(pesoActual.getRight());
        return pesoLeft + pesoRight + 1;

        // Operador ternario
        /*
         * private int getHeighRecursivo(Node<Interger> actual){
         * return actual != null ? Math.max(
         * getHeighRecursivo(actual.getLeft),
         * getHeighRecursivo(actual.getRight))
         * +1 : null;
         * }
         */
    }
}
