import models.Person;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.IntTree;


public class App {

    public static void main(String[] args) throws Exception {

        runIntTree();
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
        System.out.println(personTree.inOrder());
        

    }
    public static void runEjercicio1(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
    }

}