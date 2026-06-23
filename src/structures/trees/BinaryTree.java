package structures.trees;

import java.util.LinkedList;
import java.util.Queue;
import structures.node.Node;

public class BinaryTree <T extends Comparable <T>> {

    private Node<T> root;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public BinaryTree() {
        this.root = null;
    }


    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> node) {
        root = node;
    }

    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        root = node;
    }

    public void insert(T value) { // 10
        Node<T> node = new Node<T>(value);
        root = insertRecursivo(root, node);
    }

    public void insert(Node<T> value) { // 10
        root = insertRecursivo(root, value);
    }

    // recursivo para insertar valores ARBOL BINARIO
    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {

        if (actual == null) {
            return nodeInsertar;
        }

        // validar si es mayor o menor y decidir si lo ingreso a la der o izq
        if (actual.getValue().compareTo(nodeInsertar.getValue())> 0)  {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }
    //Metodo preOrder 
    public void preOrder() {
        preOrderRecursivo(root);
    }
    private void preOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;

        System.out.print(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }
    //Metodo posOrder
    public void posOrder() {
        posOrderRecursivo(root);
    }
    private void posOrderRecursivo(Node<T> actual) {

        if (actual == null)
            return;

        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());

        System.out.print(actual + " ");
    }

    // inorder
    public void inOrder() {
        inOrderRecursivo(root);
    }
    private void inOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;
        inOrderRecursivo(actual.getLeft());

        System.out.print(actual + " ");

        inOrderRecursivo(actual.getRight());
    }

    // niveles
    public void niveles() {

        if (root == null)
            return;

        Queue<Node<T>> cola = new LinkedList<>();
        cola.add(root);
        while (!cola.isEmpty()) {
            Node<T> actual = cola.poll();
            System.out.print(actual + " ");
            if (actual.getLeft() != null) {
                cola.add(actual.getLeft());
            }
            if (actual.getRight() != null) {
                cola.add(actual.getRight());
            }
        }
    }

    // altura
    public int altura() {
        return alturaRecursiva(root);
    }
    private int alturaRecursiva(Node<T> actual) {
        if (actual == null)
            return 0;
        int alturaIzquierda = alturaRecursiva(actual.getLeft());
        int alturaDerecha = alturaRecursiva(actual.getRight());
        if (alturaIzquierda > alturaDerecha) {
            return alturaIzquierda + 1;
        } else {
            return alturaDerecha + 1;
        }
    }
    
    //Peso del arbol;
    public int peso(){
        return pesoRecursivo(root);
    }
    private int pesoRecursivo(Node<T> actual) {
        if (actual == null)
            return 0;
        int pesoIzquierda = alturaRecursiva(actual.getLeft());
        int pesoDerecha = alturaRecursiva(actual.getRight());

        return pesoIzquierda + pesoDerecha +1;

    }
}

