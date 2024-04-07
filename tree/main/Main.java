package tree.main;

import java.util.Scanner;

import tree.binarytree.BinaryTree;

public class Main {
    public static void main(String[] ars){
        Scanner scanner = new Scanner(System.in);
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(scanner);
        binaryTree.printTree();
    }
}
