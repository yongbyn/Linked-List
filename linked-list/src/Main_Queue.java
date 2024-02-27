public class Main_Queue {
    public static void main(String[] args) {

        MyQueue<Integer> queue = new MyQueue<>();

        // enqueue
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // dequeue()
        Integer dequeueItem = queue.dequeue();
        System.out.println("dequeueItem = " + dequeueItem);

        // peek
        Integer peekItem = queue.peek();
        System.out.println("peekItem = " + peekItem);

        // exception
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
