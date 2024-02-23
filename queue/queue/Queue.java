package queue.queue;

import queue.node.QueueNode;

public class Queue {
    public QueueNode front;
    public QueueNode rear;
    public int size;

    //isEmpty() method to check if queue is empty or not
    boolean isEmpty(){
        return size == 0;
    }

    //getSize() method to get the size of the queue
    int getSize(){
        return size;
    }

    //offer method to add nodes in Queue
    public void offer(int data){
        if(isEmpty()){
            front = rear = new QueueNode(data);
        }
        QueueNode node = new QueueNode(data);
        node.next = rear;
        rear = node;
        size++;
    }

    public int remove(){
        if(isEmpty()){
            System.err.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int removed = front.value;
        front = front.next;
        size--;
        return removed;
    }

    //peek() method
    public int peek(){
        if(isEmpty()){
            System.err.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        return front.value;
    }

    
}
