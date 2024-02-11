package linkedLists.doublyLinkedList.node;

public class Node {

    public int value;
    public Node next;
    public Node previous; 

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node previous, Node next){
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

}
