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
}
