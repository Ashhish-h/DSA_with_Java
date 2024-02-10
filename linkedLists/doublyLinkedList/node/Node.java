package linkedLists.doublyLinkedList.node;

public class Node {

    public int value;
    public Node next;
    public Node previous; 

    public Node(int value){
        this.value = value;
    }

    public Node(int value, Node next, Node previous){
        this.value = value;
        this.next = next;
        this.previous = previous;
    }
    
    @Override
	public String toString() {
		return "{"
				+ (previous == null ? "null" : previous.value)
				+ " <--> " + this.value + " <--> "
				+ (next == null ? "null" : next.value)
				+ "}";
    }

}
