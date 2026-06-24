package structures.trees.Ejercicio_3_listLevels;
import structures.node.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ejercicio3 {
    public List<List<Node<Integer>>> listLevels(Node<Integer> root){
        List<List<Node<Integer>>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Node<Integer>> level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                Node<Integer> current = queue.poll();
                level.add(current);
                if(current.getLeft() != null){
                    queue.add(current.getLeft());
                }
                if(current.getRight() != null){
                    queue.add(current.getRight());
                }
            }
            result.add(level);
        }
        return result;
    }
}

