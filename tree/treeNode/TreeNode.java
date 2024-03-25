package tree.treeNode;

public class TreeNode {
    int data;
    TreeNode leftNode;
    TreeNode rightNode;

    //constructor
    public TreeNode(int data){
       this.data = data;
       this.leftNode = null;
       this.rightNode = null; 
    }

    //toString for Node class
    public String toString() {
		return "TreeNode{" + "data=" + data + ", leftNode=" + leftNode + ", rightNode=" + rightNode + '}';
	}

}
