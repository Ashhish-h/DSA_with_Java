package scratch.treeScratch;

import java.util.Scanner;

public class BinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private Node rootNode;

    public BinaryTree(Node rootNode){
        this.rootNode = rootNode;
    }

    Scanner scanner = new Scanner(System.in);

    public void insert(int data){
        
    }
}
