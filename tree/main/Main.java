package tree.main;

import java.util.Scanner;

import tree.binarySearchTree.BinarySearchTree;
import tree.binarytree.BinaryTree;
import tree.treeNode.TreeNode;

public class Main {
    public static void main(String[] ars){
        Scanner scanner = new Scanner(System.in);
        // BinaryTree binaryTree = new BinaryTree();
        // binaryTree.insert(scanner);
        // binaryTree.printTree();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        // TreeNode root = null;
        // int[] arr = {5, 1, 3, 7, 4, 2};
        // for(int i = 0; i < arr.length; i++){
        //     root = binarySearchTree.insert(root, arr[i]);
        // }

        // binarySearchTree.inOrderTraversal(root);
        // System.out.println();
        // TreeNode searchedNode = binarySearchTree.search(7);
        // System.out.println(searchedNode.data);

        int[] arr = {5, 1, 3, 7, 4, 2};
        for(int i = 0; i < arr.length; i++){
            binarySearchTree.insert(arr[i]);
        }

        binarySearchTree.inOrderTraversal(binarySearchTree.rootNode);
        System.out.println();

        TreeNode delValue = binarySearchTree.delete(binarySearchTree.rootNode, 3);
        System.out.println(delValue.data);

    }
}
