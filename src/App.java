import java.util.List;

import models.Person;
import structures.trees.BinaryTree;
import structures.trees.IntTree;
import structures.trees.Ejercicio_1_insert.Ejercicio1;
import structures.trees.Ejercicio_2_invert.Ejercicio2;
import structures.trees.Ejercicio_3_listLevels.Ejercicio3;
import structures.trees.Ejercicio_4_depth.Ejercicio4;
import structures.node.*;


public class App {

    public static void main(String[] args) throws Exception {
        //llamo a los metodos para que impriman 
        System.out.println("========= int tree ===========");
        runIntTree();
        System.out.println("========= Person Tree =========");
        runPersonTree();
        System.out.println("========= Ejercicio 1 =========");
        runEjercicio1();
        System.out.println("========= Ejercicio 2 =========");
        runEjercicio2();
        System.out.println("========= Ejercicio 3 ========");
        runEjercicio3();
        System.out.println("========= Ejercicio 4 =========");
        runEjercicio4();
    }

    private static void runIntTree() {

        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8);
        arbolNumeros.insert(20);
        arbolNumeros.insert(15);
        //
        System.out.println("Pre Order");
        arbolNumeros.preOrder();
        System.out.println();
        System.out.println();
        System.out.println("Pos Order");
        arbolNumeros.posOrder();
        System.out.println();
        System.out.println();
        System.out.println("In Order");
        //inOrder
        arbolNumeros.inOrder();
        System.out.println();
        System.out.println();
        System.out.println("Por niveles");

        //niveles
        arbolNumeros.niveles();
        System.out.println();
        System.out.println();
        System.out.println("Altura");
        System.out.println(arbolNumeros.altura());

        //peso
        arbolNumeros.peso();
        System.out.println();
        System.out.println();
        System.out.println("peso");
        System.out.println(arbolNumeros.peso());
    }
    private static void runPersonTree(){

        BinaryTree<Person> personTree = new BinaryTree<>();

        personTree.insert(new Person ("Alice", 30));
        personTree.insert(new Person ("Bob", 25));
        personTree.insert(new Person ("Diego", 35));
        personTree.insert(new Person ("Rafael", 35));
        personTree.insert(new Person ("Ana", 35));

        personTree.inOrder();
        System.out.println();
        System.out.println();
        System.out.println("inOrder");
        

    }
    public static void runEjercicio1(){
    Ejercicio1 ejercicio1 = new Ejercicio1();
    int[] numeros = {5, 3, 7, 2, 4, 6, 8};
    Node<Integer> root = ejercicio1.insert(numeros);
    System.out.println("Árbol BST:");
    ejercicio1.printTree(root);
    }

    public static void runEjercicio2(){
    Ejercicio1 ejercicio1 = new Ejercicio1();
    Ejercicio2 ejercicio2 = new Ejercicio2();
    int[] numeros = {5, 3, 7, 2, 4, 6, 8};

    Node<Integer> root = ejercicio1.insert(numeros);

    System.out.println("Árbol original:");
    ejercicio1.printTree(root);
    ejercicio2.invert(root);
    System.out.println();
    System.out.println("Árbol invertido:");
    ejercicio1.printTree(root);
    }

    public static void runEjercicio3(){
    Ejercicio1 ejercicio1 = new Ejercicio1();
    Ejercicio3 ejercicio3 = new Ejercicio3();
    int[] numeros = {5, 3, 7, 2, 4, 6, 8};
    Node<Integer> root = ejercicio1.insert(numeros);
    List<List<Node<Integer>>> result = ejercicio3.listLevels(root);
    for(List<Node<Integer>> level : result){
        for(Node<Integer> n : level){
            System.out.print(n.getValue() + " -> ");
        }
        System.out.println();
        }
    }
    public static void runEjercicio4(){

    Ejercicio1 ejercicio1 = new Ejercicio1();
    Ejercicio4 ejercicio4 = new Ejercicio4();

    int[] numeros = {5, 3, 7, 2, 4, 6, 8};

    Node<Integer> root = ejercicio1.insert(numeros);

    System.out.println("Profundidad maxima del árbol: " + ejercicio4.maxDepth(root));
}
}