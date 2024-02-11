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
}
