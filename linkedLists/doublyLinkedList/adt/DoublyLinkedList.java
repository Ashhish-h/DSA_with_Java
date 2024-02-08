package linkedLists.doublyLinkedList.adt;

import linkedLists.doublyLinkedList.node.Node;

public interface DoublyLinkedList {

    public boolean isEmpty();

    public int size();

    public void addFirst(int val);

    public void add(int val);

    public int removeFirst();

    public int remove(int index);

    public int search(int val);

    public Node search();

    
}
