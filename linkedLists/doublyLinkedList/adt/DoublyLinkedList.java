package linkedLists.doublyLinkedList.adt;

import linkedLists.doublyLinkedList.node.Node;

public interface DoublyLinkedList {

    public boolean isEmpty();

    public int size();

    public void addFirst(int val);

    public void addLast(int val);

    public void add(int val, int index);

    public int removeFirst();

    public int removeLast();

    public int remove(int index);

    public int search(int val);

    public Node search();

    
}
