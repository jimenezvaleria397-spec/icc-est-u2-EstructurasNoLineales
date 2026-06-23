package structures.trees;
import structures.node.*;

public class Ejercicio2 {
    public Node<Integer> invert (Node<Integer> root){

        invertRecursively(root);
        return root;

    }
    private void invertRecursively(Node<Integer> root){
        if(root == null)
            return;

    Node<Integer> aux = root.getLeft();
    root.setLeft(root.getRight());
    root.setRight(aux);

    invertRecursively(root.getLeft());
    invertRecursively(root.getRight());
    }
}
