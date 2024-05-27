package tree.avlTree;

public class Main {
    public static void main(String[] arhs){
        AVLTree avlTree = new AVLTree();
        // avlTree.root = null;
        avlTree.root = avlTree.insert(null, 10);
        avlTree.root = avlTree.insert(avlTree.root, 20);
        avlTree.root = avlTree.insert(avlTree.root, 30);
        avlTree.root = avlTree.insert(avlTree.root, 40);
        avlTree.root = avlTree.insert(avlTree.root, 50);
        avlTree.root = avlTree.insert(avlTree.root, 25);

        avlTree.preOrderTraversal(avlTree.root);
    }
}
