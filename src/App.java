import java.util.List;
import java.util.Set;

import collections.maps.Maps;
import collections.set.Sets;
import models.Contacto;
import models.Person;
import structures.trees.BinaryTree;
import structures.trees.IntTree;
import structures.trees.Ejercicio_1_insert.Ejercicio1;
import structures.trees.Ejercicio_2_invert.Ejercicio2;
import structures.trees.Ejercicio_3_listLevels.Ejercicio3;
import structures.trees.Ejercicio_4_depth.Ejercicio4;
import structures.graphs.Graph;
import structures.graphs.PathResult;
import structures.graphs.implementations.DFSPathFinder;
import structures.node.*;


public class App {

    public static void main(String[] args) throws Exception {
        //llamo a los metodos para que impriman 
       // System.out.println("========= int tree ===========");
        //runIntTree();
        //System.out.println("========= Person Tree =========");
        //runPersonTree();
        //System.out.println("========= Ejercicio 1 =========");
        //runEjercicio1();
        //System.out.println("========= Ejercicio 2 =========");
        //runEjercicio2();
        //System.out.println("========= Ejercicio 3 ========");
        //runEjercicio3();
        //System.out.println("========= Ejercicio 4 =========");
        //runEjercicio4();
        //runSets();
        //runMaps();
        //runGraphs();
        runGraphs2();
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
    public static void runSets(){
        Sets sets = new Sets();

        // Primera isntancia de hashSet
        System.out.println("==== HashSet ====");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Tamanio" + hashSet.size());
        System.out.println(hashSet.contains("F"));

        //segunda implementacion de LinkedHashSet
        System.out.println("===== Linked Hash Set =====");
        Set<String> lnSet = sets.construirLinkedHashSet();
        System.out.println(lnSet);
        System.out.println(lnSet.size());
        System.out.println(lnSet.contains("B"));

        //Implemetancion de TreeSet
        System.out.println("===== TreeSet =====");
        Set<String> tSet = sets.construirLinkedHashSet();
        System.out.println(tSet);
        System.out.println(tSet.size());
        System.out.println(tSet.contains("B"));

        //Implementacion Tree Set Contacto
        System.out.println("===== TreeSet Contacto =====");
        Set<Contacto> tCSet = sets.construirTeeSetConComparador();
        System.out.println(tCSet);
        System.out.println(tCSet.size());
        System.out.println(tCSet.contains("B"));

        //implementacio de construirHashSetContacto 
        System.out.println("===== HashSet Contacto =====");
        Set<Contacto> hCSet = sets.construirTeeSetConComparador();
        System.out.println(hCSet);
        System.out.println(hCSet.size());
        System.out.println(hCSet.contains("B"));
    }

    //DICCIONARIOS:
    private static void runMaps(){
        Maps map = new Maps();
        map.construirHashMap();
    }
    //hacer push y readme 
    //run grafos
    public static void runGraphs(){
        Graph<String> g = new Graph<>();
        g.add("A");
        g.add("B");
        g.add("C");
        g.add("D");
        g.add("J");

        g.addEdge("J", "D");
        g.addEdge("C", "D");
        

        g.addEdgeUni("A", "B");
        g.addEdgeUni("B", "C");
        g.addEdgeUni("B", "D");
        g.addEdgeUni("C", "A");
        //=======IMPRESION=========
        g.printGraph();
        System.out.println();
        System.out.println();
        System.out.println("Grafos");
    }
    public static void runGraphs2(){

        Graph<String> g = new Graph<>();
        g.addEdge("A", "B");
        g.addEdge("A", "C");
        g.addEdge("B", "D");
        g.addEdge("C", "J");
        g.addEdge("D", "E");
        g.addEdge("E", "F");
        g.addEdge("K", "J");

        DFSPathFinder<String> dfs = new DFSPathFinder<String>();
        PathResult<String> result = dfs.find(g, "A", "F");
        PathResult<String> result2 = dfs.find(g, "A", "J");
        PathResult<String> result3 = dfs.find(g, "A", "K");
    }

}