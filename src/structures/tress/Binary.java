package structures.tress;

import structures.node.Node;

public class Binary<T extends Comparable<T>> {

    public Binary() {
        this.root = null;
    }

    private Node<T> root;

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        this.root = node;
    }

    public void add(T value) {
        Node<T> node = new Node<T>(value);
        root = addRecursivo(root, node);
    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }
        // if (actual.getValue() > nodeInsertar.getValue()) {
        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
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

    private void preOrdenRecursivo(Node<T> actual) {
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

    private void posOrdenRecursivo(Node<T> actual) {
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

    private void inOrdenRecursivo(Node<T> actual) {
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

    public int getHeightRecursivo(Node<T> heightActual) {
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

    public int getPesoRecursivo(Node<T> pesoActual) {
        if (pesoActual == null) {
            return 0;
        }

        int pesoLeft = getHeightRecursivo(pesoActual.getLeft());
        int pesoRight = getHeightRecursivo(pesoActual.getRight());
        return pesoLeft + pesoRight + 1;
    }
}
