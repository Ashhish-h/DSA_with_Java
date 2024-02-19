     package stacks.stacks;

public class Stack {

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

    //deleting data from the stack (pop() method)
    public int pop(){
        if(isUnderflow()){
            System.err.println("stack underflow");
            return Integer.MIN_VALUE;
        }
        Node poppedNode = top;
        top = top.next;
        size--;
        return poppedNode.data;
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
