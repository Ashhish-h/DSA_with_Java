package tree.binarySearchTree;

import tree.treeNode.TreeNode;

public class BinarySearchTree {
    TreeNode rootNode;

    public BinarySearchTree(){
        this.rootNode = null;
    }

    public BinarySearchTree(TreeNode rootNode){
        this.rootNode = rootNode;
    }

    public BinarySearchTree(int data, BinarySearchTree leftTree, BinarySearchTree rightTree){
        this.rootNode = new TreeNode(data);
        if(leftTree != null){
            this.rootNode.leftNode = leftTree.rootNode;
        } else {
            this.rootNode.leftNode = null;
        }

        if(rightTree != null){
            this.rootNode.rightNode = rightTree.rootNode; 
        } else {
            this.rootNode.rightNode = null;
        }
    }
}
