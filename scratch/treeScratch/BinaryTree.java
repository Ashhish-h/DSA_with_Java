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

    // public BinaryTree(Node rootNode){
    //     this.rootNode = rootNode;
    // }


    public void insert(Scanner scanner){
        System.out.println("Enter the rootNode");
        int data = scanner.nextInt();
        rootNode = new Node(data);
        insert(scanner, rootNode);
    }


    private void insert(Scanner scanner, Node node) {
        System.out.println("Do you wish to enter leftNode");
        boolean leftNode = scanner.nextBoolean();
        if(leftNode){
            System.out.println("Enter the data ");
            int data = scanner.nextInt();
            node.left = new Node(data);
            insert(scanner, node.left);
        }
        
        System.out.println("Do you want to enter rightNode");
        boolean rightNode = scanner.nextBoolean();
        if(rightNode){
            System.out.println("Enter the data ");
            int data = scanner.nextInt();
            node.right = new Node(data);
            insert(scanner, node.right);
        }
    }
}

class Main{
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        binaryTree.insert(scanner);
    }
}