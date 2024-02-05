package linkedLists.singlyLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertFirst(45);
        list.insertFirst(34);
        list.insertFirst(67);
        list.display();
        list.insertLast(90);
        list.display();
        list.insertWithoutTail(87);
        list.display();
        list.insert(35, 2);
        list.display();

        boolean empty = list.isEmpty();
        System.out.println(empty);
    }
}


