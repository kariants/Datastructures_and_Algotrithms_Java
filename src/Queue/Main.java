package Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(2);

        queue.enqueue(1);

        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue().value);
        System.out.println(queue.dequeue());

    }
}
