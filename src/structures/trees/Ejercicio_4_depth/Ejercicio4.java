package structures.trees.Ejercicio_4_depth;
import structures.node.*;

public class Ejercicio4 {
    public int maxDepth(Node<Integer> root){

        if(root == null){
            return 0;
        }

        int leftDepth = maxDepth(root.getLeft());
        int rightDepth = maxDepth(root.getRight());

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
