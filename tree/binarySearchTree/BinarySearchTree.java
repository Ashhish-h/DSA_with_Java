package tree.binarySearchTree;

import tree.treeNode.TreeNode;

public class BinarySearchTree {
    public TreeNode rootNode;
    

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

    // public TreeNode insert(TreeNode root, int value){
    //     if(root == null){
    //         root = new TreeNode(value);
    //         return root;
    //     }

    //     if(root.data > value){
    //         root.leftNode = insert(root.leftNode, value);
    //     } else {
    //         root.rightNode = insert(root.rightNode, value);
    //     }

    //     return root;
    // }

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
                    parent.leftNode = node;
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

    public TreeNode delete(TreeNode rootNode, int data){
        if(rootNode.data < data){
            rootNode.rightNode = delete(rootNode.rightNode, data);
        } else if (rootNode.data > data){
            rootNode.leftNode = delete(rootNode.leftNode, data);
        } else {
            //case 1 - deleting a leaf node
            if(rootNode.leftNode == null && rootNode.rightNode == null){
                return null;
            }

            //case 2 - deleting a node with one child
            if(rootNode.leftNode == null){
                return rootNode.rightNode;
            } else if(rootNode.rightNode == null){
                return rootNode.leftNode;
            }

            //case 3 - deleting a node with two childs
            TreeNode successor = findInOrderSuccessor(rootNode.rightNode);
            rootNode.data = successor.data;
            rootNode.rightNode = delete(rootNode.rightNode, successor.data);
        }
        return rootNode;
    }

    public TreeNode findInOrderSuccessor(TreeNode rootNode){
        while(rootNode.leftNode != null){
            rootNode = rootNode.leftNode;
        }
        return rootNode;
    }

    public void printInRange(TreeNode rootNode, int startRange, int endRange){
        if(rootNode == null){
            return;
        }

        if(rootNode.data >= startRange && rootNode.data <= endRange){
            printInRange(rootNode.leftNode, startRange, endRange);
            System.out.println(rootNode.data + " ");
            printInRange(rootNode.rightNode, startRange, endRange);
        } else if(rootNode.data < startRange){
            printInRange(rootNode.leftNode, startRange, endRange);
        } else {
            printInRange(rootNode.rightNode, startRange, endRange);
        }
    }
}
