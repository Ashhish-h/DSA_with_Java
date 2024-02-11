package linkedLists.doublyLinkedList.DoublyLinkedList;

import linkedLists.doublyLinkedList.adt.DoublyLinkedList;
import linkedLists.doublyLinkedList.node.Node;

public class IntegerDoublyLinkedList implements DoublyLinkedList {
    private int size = 0;
    Node head;
    Node tail;
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addFirst(int val) {
        Node node = new Node(val, head, tail);
		head = node;
		tail = node;
		size++;
    }

    @Override
    public void add(int val) {
        if (this.isEmpty()) {
			addFirst(val);
		} else {
			Node node = new Node(val, tail, null);
			tail.next = node;
			tail = node;
			size++;
		}
    }

    @Override
    public int removeFirst() {
        int removedData = head.value;
		if (head == tail) { // there is only one node in the list
			head = null;
			tail = null;
		} else {
			head = head.next;
			head.previous = null;
		}
		size--;
		return removedData;
    }

    @Override
    public int remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public Node search() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }

    @Override
    public void print() {
        Node currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode);
			currentNode = currentNode.next;
		}
        System.out.println();
    }
    
}
