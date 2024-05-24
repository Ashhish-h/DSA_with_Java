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

    public void insert(int data){
        TreeNode node = new TreeNode(data);

        if(rootNode == null){
            rootNode = node;
            return;
        }

        TreeNode current = rootNode;
        TreeNode parent = null;
        while(true){
            parent = current;
            if(data < current.data){
                current = current.leftNode;
                if(current == null){
                    parent.leftNode =  node;
                    return;
                }
            } else {
                current = current.rightNode;
                if(current == null){
                    parent.rightNode = node;
                    return;
                }
            }
        }
    }
    
}
