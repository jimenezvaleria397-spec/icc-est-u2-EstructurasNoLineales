package structures.trees;
import structures.node.*;

public class Ejercicio1 {
    public void insert(int[] numeros){
        //Crear un arbol
        BinaryTree<Integer> tree = new BinaryTree<>();
        //Insertar los numeros en el arbol
        for(int numero: numeros)
            tree.insert(numero);
        //imprimir el arbol [5,3,7,2,4,6,8]
        //printTree(tree.getRoot());
        //Preorder
        //InOrder
        //Slash t para imprimir los tabs 
    }
    public void printTree(Node <Integer> root ){
        System.out.println("Imprimiendo el arbol:");
        printTreeRecursivo(root,0);
    }
    private void printTreeRecursivo(Node <Integer> actual,int nivel){
        if(actual == null)
            return;
        printTreeRecursivo(actual.getRight(), nivel + 1);
        for (int i = 0; i < nivel; i ++ )
            System.out.println("\t");
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
        
    }
    
}
