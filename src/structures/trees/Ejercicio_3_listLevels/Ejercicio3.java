package structures.trees.Ejercicio_3_listLevels;
import structures.node.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ejercicio3 {
    //metodo que devuelve organizado por niveles
    public List<List<Node<Integer>>> listLevels(Node<Integer> root){
        //varibale result en donde se guardaran los niveles, ademas la cola nos ayuda a recorrer en BFS
        List<List<Node<Integer>>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);
        //ciclo que mientras haya nodos funciona 
        while(!queue.isEmpty()){
            //indica cuntos nodos hay en este nivel actual
            int size = queue.size();
            List<Node<Integer>> level = new ArrayList<>();
            //con un for recorremos un nivel por completo
            for(int i = 0; i < size; i++){
                Node<Integer> current = queue.poll();
                level.add(current);
                //condicionales que agrgan los hijos a una cola
                if(current.getLeft() != null){
                    queue.add(current.getLeft());
                }
                if(current.getRight() != null){
                    queue.add(current.getRight());
                }
            }
            //aniado y guardo el nivel en result
            result.add(level);
        }
        return result;
    }
}

