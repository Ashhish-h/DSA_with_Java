package linkedLists.singlyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    private int size;

    //default size of LinkedList
    LinkedList(){
        this.size = 0;
    }

    //Inserting First Node
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size++;
    }


    //insert at the last of the linkedlist
    public void insertLast (int val) {
        if(tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    //Printing elements of LinkedList.
    public void display(){
        Node traverser = head;
        while(traverser != null){
            System.out.print(traverser.value + " -> ");
            traverser = traverser.next;
        }
        System.out.print("End");
    }

    //inserting in a list without using tail
    public void insertWithoutTail(int val){
        Node node = new Node(val);
        //if linkedlist is empty
        if(head == null){
            head = node;
            return;
        }

        Node traverser = head;
        while(traverser.next != null){
            traverser = traverser.next;
        }
        traverser.next = node;
        size++;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}