package linkedLists.doublyLinkedList.main;

import linkedLists.doublyLinkedList.DoublyLinkedList.IntegerDoublyLinkedList;

public class Main {
    public static void main(String[] args){
        IntegerDoublyLinkedList list = new IntegerDoublyLinkedList();
        list.add(67);
        list.add(80);
        list.add(34);
        list.add(88);
        list.print();
    }
}
