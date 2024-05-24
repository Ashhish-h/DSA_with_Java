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

    public boolean isLeafNode(TreeNode node){
        if(node == null){
            return true;
        }
        return node.leftNode == null & node.rightNode == null;
    }

    public BinarySearchTree getLeftSubTree(){
        if(this.rootNode != null && this.rootNode.leftNode != null){
            return new BinarySearchTree(this.rootNode.leftNode);
        } else return null;
    }

    public BinarySearchTree getRightSubTree(){
        if(this.rootNode != null && this.rootNode.rightNode != null){
            return new BinarySearchTree(this.rootNode.rightNode);
        } else return null;
    }

    public TreeNode insert(TreeNode root, int value){
        if(root == null){
            root = new TreeNode(value);
            return root;
        }

        if(root.data > value){
            root.leftNode = insert(root.leftNode, value);
        } else {
            root.rightNode = insert(root.rightNode, value);
        }

        return root;
    }

    public void inOrderTraversal(TreeNode rootNode){
        if(rootNode == null){
            return;
        }
        inOrderTraversal(rootNode.leftNode);
        System.out.print(rootNode.data + " ");
        inOrderTraversal(rootNode.rightNode);
    }

    public TreeNode search(int key){
        TreeNode currentNode = this.rootNode;
        while (currentNode != null) {
        if (currentNode.data == key) {
            return currentNode; // Node found
        } else if (key < currentNode.data) {
            currentNode = currentNode.leftNode;
        } else {
            currentNode = currentNode.rightNode;
        }
    }
    return null; // Node not found
    }
}
