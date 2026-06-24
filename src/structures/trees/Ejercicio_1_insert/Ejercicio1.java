package structures.trees.Ejercicio_1_insert;
import structures.node.*;
import structures.trees.BinaryTree;
public class Ejercicio1 {

    public Node<Integer> insert(int[] numeros){

        BinaryTree<Integer> tree = new BinaryTree<>();
        for(int numero : numeros){
            tree.insert(numero);
        }
        return tree.getRoot();
    }

    public void printTree(Node<Integer> root){
        System.out.println("Imprimiendo el árbol:");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel){
        if(actual == null){
            return;
        }
        printTreeRecursivo(actual.getRight(), nivel + 1);
        for(int i = 0; i < nivel; i++){
            System.out.print("\t");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
}
        //Ejercicios no incluir en el readme pero si en el informe 
        
