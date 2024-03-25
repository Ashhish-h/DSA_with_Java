package linkedLists.singlyLinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.insertFirst(45);
        list.insertFirst(34);
        list.insertFirst(67);
        // list.display();

        list.insertLast(90);
        list.insertLast(80);
        list.insertLast(100);
        // list.display();

        // list.insertWithoutTail(87);
        // list.display();

        // list.insert(35, 2);
        boolean empty = list.isEmpty();
        System.out.println("is linkedlist empty " + empty);

        int size = list.size();
        System.out.println("size of the linkedlist " + size);

        System.out.print("Nodes of linkedlist are: ");
        list.display();

        System.out.println("deleted first node of the linkedlist " + list.deleteFirst());
        
        // list.display();

        // System.out.println("deleted last node of the linkedlist " + list.deleteLast());

        // list.disp//lay();

        // System.out.println("deleted node of a linkedlist is " + list.delete(3));

        // list.display();

        // System.out.println("position of the node in the linkedList is " + list.search(80));


        
    }
}


