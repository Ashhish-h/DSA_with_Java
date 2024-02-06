package linkedLists.singlyLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertFirst(45);
        list.insertFirst(34);
        list.insertFirst(67);
        // list.display();

        list.insertLast(90);
        // list.display();

        list.insertWithoutTail(87);
        // list.display();

        list.insert(35, 2);
        boolean empty = list.isEmpty();
        System.out.println("is linkedlist empty " + empty);

        int size = list.size();
        System.out.println("size of the linkedlist " + size);

        System.out.print("Nodes of linkedlist are: ");
        list.display();

        System.out.println("deleted first node of the linkedlist " + list.deleteFirst());
        
        list.display();

        System.out.println("deleted last node of the linkedlist " + list.deleteLast());

        list.display();


        
    }
}


