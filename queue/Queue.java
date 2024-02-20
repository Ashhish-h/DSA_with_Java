package queue;

public class Queue {
    public QueueNode front;
    public QueueNode rear;
    public int size;

    

    public static class QueueNode{
        int value;
        QueueNode next;
        public QueueNode(int value){
            this.value = value;
            this.next = null;
        }

    }
}
