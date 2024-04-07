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
    System.out.println("Do you want to insert leftNode");
    boolean leftNode = scanner.nextBoolean();
    if(leftNode){
      System.out.println("Enter the value of the node");
      int value = scanner.nextInt();
      node.leftNode = new TreeNode(value);
      insert(scanner, node.leftNode);
    }

    System.out.println("Do you want to insert rightNode");
    boolean rightNode = scanner.nextBoolean();
    if(rightNode){
      System.out.println("Enter the value of node");
      int value = scanner.nextInt();
      node.rightNode = new TreeNode(value);
      insert(scanner, node.rightNode);
    }
  }

  public void printTree(){
    printTree(rootNode, 0);
  }

  private void printTree(TreeNode node, int level) {
    if(node == null){
      return;
    }

    printTree(node.rightNode, level + 1);

    if(level != 0){
      for(int i = 0; i < level - 1; i++){
        System.out.print("|\t\t");
      }
      System.out.println("|------->" + node.data);
    } else {
      System.out.println(node.data);
    }
    printTree(node.leftNode, level + 1);

  }

}
