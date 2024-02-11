package linkedLists.circularLinkedList;

import linkedLists.doublyLinkedList.DoublyLinkedList.IntegerDoublyLinkedList;
import linkedLists.doublyLinkedList.node.Node;

public class CircularLinkedList extends IntegerDoublyLinkedList {

    public void makeCircular() {
		if (head != null) {
			tail.next = head;
			head.previous = tail;
		}
	}

    public void add(int data) {
		super.add(data);
		makeCircular();
	}

    public int remove(int data) {
		int removed = super.remove(data);
		makeCircular();
		return removed;
	}

    public void print() {
		Node currentNode = head;
		if (currentNode != null) { // Check for empty list
			do {
				System.out.print(currentNode);
				currentNode = currentNode.next;
			} while (currentNode != head); // Loop until reaching the head again
		}
	}

}
