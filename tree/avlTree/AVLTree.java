package tree.avlTree;

public class AVLTree {
    static class Node{
        int data, height;
        Node leftNode, rightNode;
        
        public Node(int data){
            this.data = data;
            this.height = 1;
            this.leftNode = null;
            this.rightNode = null;
        }
    }

    Node root;

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        return root.height;
    }

    public int getBalanceFactor(Node root){
        if(root == null){
            return 0;
        }
        return height(root.leftNode) - height(root.rightNode);
    }

    public Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }

        if(data < root.data){
            root.leftNode = insert(root.leftNode, data);
        } else if(data > root.data){
            root.rightNode = insert(root.rightNode, data);
        } else {
            return root;
        }

        // Update height of the root
        root.height = 1 + Math.max(height(root.leftNode), height(root.rightNode));
        
        // Get root's balance factor
        int balanceFactor = getBalanceFactor(root);

        // Cases for Balancing :-
        // Left-Left case
        if(balanceFactor > 1 && data < root.leftNode.data){
            return rightRotate(root);
        }

        //Right-Right case
        if(balanceFactor < -1 && data > root.rightNode.data){
            return leftRotate(root);
        }

        // Left-Right case
        if(balanceFactor > 1 && data > root.leftNode.data){
            root.leftNode = leftRotate(root.leftNode);
            return rightRotate(root);
        }

        // Right-left case
        if(balanceFactor < -1 && data < root.rightNode.data){
            root.rightNode = rightRotate(root.rightNode);
            return leftRotate(root);
        }

        return root;

    }
}
