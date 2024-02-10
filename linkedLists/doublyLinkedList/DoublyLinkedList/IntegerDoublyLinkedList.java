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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public int removeFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
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
        Node current = head;
        while(current != null){
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("End");
    }
    
}
