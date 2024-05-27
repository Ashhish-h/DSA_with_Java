package scratch.treeScratch;

import tree.binarySearchTree.BinarySearchTree;

public class AVLTree extends BinarySearchTree{
    static class TreeNode {
        public int data;
        public TreeNode leftNode;
        public TreeNode rightNode;
        public int height;
    
        //constructor
        public TreeNode(int data){
           this.data = data;
           this.leftNode = null;
           this.rightNode = null;
           this.height = 1; 
        }
    
        //toString for Node class
        public String toString() {
            return "TreeNode{" + "data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + '}';
        }
    
    }

    public TreeNode rootNode;
    

    public AVLTree(){
        this.rootNode = null;
    }

    public AVLTree(TreeNode rootNode){
        this.rootNode = rootNode;
    }

    public static int height(TreeNode rootNode){
        if(rootNode == null){
            return 0;
        }

        return rootNode.height;
    }

    public static void main(String[] args){
        AVLTree tree = new AVLTree();
        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);
    }

}
