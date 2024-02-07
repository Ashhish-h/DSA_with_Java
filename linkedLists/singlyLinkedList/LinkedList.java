package linkedLists.singlyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;

    private int size;

    //to check if linkedlist is empty or not
    boolean isEmpty(){
        return size == 0;
    }

    //to get the size of the linkedlist
    public int size(){
        return size;
    }

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
        System.out.println("End");
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


    //MyLogic -

    // //inserting at any given position
    // public void insert(int val, int index){
    //     if(index == 0){
    //         insertFirst(val);
    //         return;
    //     }

    //     if(index == size){
    //         insertLast(val);
    //         return;
    //     }

    //     Node node = new Node(val);
    //     Node temp = head;
    //     int i = 0;
    //     while(i < index - 1){
    //         temp = temp.next;
    //         i++;
    //     }
    //     node.next = temp.next;
    //     temp.next = node;
    //     size++;
    // }

    //inserting at any position

    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;

        for(int i = 1; i < index; i++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;

    }

    //deleting first node of the linkedlist
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    //delete last node of the linkedlist
    public int deleteLast(){
        //for this will will use two pointer approach
        Node traverser = head;
        Node nextTraverser = traverser.next;
        while(nextTraverser.next != null){
            traverser = nextTraverser;
            nextTraverser = nextTraverser.next;
        }
        int val = traverser.next.value;
        traverser.next = null;
        size--;

        if(tail == null){
            head = null;
        }

        return val;
    }

    //deleting anygiven node
    public int delete(int index){
        Node traverser = head;
        Node nextTraverser = traverser.next;
        for(int i = 0; i < index - 2; i++){
            traverser = nextTraverser;
            nextTraverser = nextTraverser.next;
        }
        int val = traverser.next.value;
        traverser.next = nextTraverser.next;
        return val;
    }



    // Node class
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