package queue;

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

    }
}
