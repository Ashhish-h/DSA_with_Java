package queue;

import queue.queue.Queue;

public class Main {
    public static void main(String[] arhs){
        Queue queue = new Queue();
        queue.offer(56);
        queue.offer(87);
        queue.offer(68);
        queue.offer(78);
        queue.offer(90);
        queue.offer(88);
        System.out.println(queue.peek());
        System.out.println(queue.remove());

    }
}
