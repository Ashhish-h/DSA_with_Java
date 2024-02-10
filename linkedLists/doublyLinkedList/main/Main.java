package linkedLists.doublyLinkedList.main;

import linkedLists.doublyLinkedList.DoublyLinkedList.IntegerDoublyLinkedList;

public class Main {
    public static void main(String[] args){
        IntegerDoublyLinkedList list = new IntegerDoublyLinkedList();
        list.addFirst(90);
        list.addFirst(67);
        list.addFirst(89);
        list.print();
    }
}
