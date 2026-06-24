package structures.tress;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import structures.node.Node;

public class Ejercicio3 {

    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {
        List<List<Node<Integer>>> result = new ArrayList<>();
        listLevelsRecursivo(root, 0, result);
        return result;
    }

    private void listLevelsRecursivo(Node<Integer> actual, int nivel, List<List<Node<Integer>>> result) {
        if (actual == null) {
            return;
        }

        if (result.size() == nivel) {
            result.add(new LinkedList<>());
        }

        result.get(nivel).add(actual);

        listLevelsRecursivo(actual.getLeft(), nivel + 1, result);
        listLevelsRecursivo(actual.getRight(), nivel + 1, result);
    }

    public void printLevels(List<List<Node<Integer>>> levels) {
        for (List<Node<Integer>> level : levels) {
            for (int i = 0; i < level.size(); i++) {
                System.out.print(level.get(i).getValue());
                if (i < level.size() - 1) {
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

}
