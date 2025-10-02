package Model2023_2024;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println("Adding customers to this queue");
        queue.enqueue("Saman", 1);
        queue.enqueue("Namali",2);
        queue.enqueue("Aruna",3);
        queue.displayQueue();
        System.out.println("Serving first Customer");
        queue.dequeue();
        queue.displayQueue();
        System.out.println();
        queue.displayQueueSize();
    }
}
