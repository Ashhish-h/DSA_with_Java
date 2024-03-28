package tree.binarytree;

import java.util.Scanner;

import tree.treeNode.TreeNode;

public class BinaryTree {
  TreeNode rootNode;
  
  public void insert(Scanner scanner){
    System.out.println("Enter the root node");
    int value = scanner.nextInt();
    rootNode = new TreeNode(value);
    insert(scanner, rootNode);
  }

  private void insert(Scanner scanner, TreeNode node){
    System.out.println("Do yoou want to insert leftNode");
    boolean leftNode = scanner.nextBoolean();
    if(leftNode){
      System.out.println("Enter the value of the node");
      int value = scanner.nextInt();
      node.leftNode = new TreeNode(value);
    }
  }
}
