package stacks.stacks;

public class Stacks {

    int size; //size of the stack

    Node top; //Node pointing to the top element of the stack

    // Method to check is stack is empty or not
    boolean isUnderflow(){
        return size == 0;
    }

    // method to get the size of the stack
    public int getSize(){
        return size;
    }

    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
        size++;
    }






    //Node class defination for stack
    static class Node{
        int value;

        Node next;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
}
