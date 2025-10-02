package Model2023_2024;

public class Queue {
    Node front;
    Node rear;
    int size = 0;
    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(String name, int ticketNumber) {
        Node newNode = new Node(new Customer(name, ticketNumber));
        if(front == null) {
            front = newNode;
            rear = newNode;
            size++;
        } else {
            Node current = front;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            rear = newNode;
            size++;
        }
        System.out.println("Added customer: " + newNode.customer.name + " with Ticket number: " + newNode.customer.ticketNumber);
    }

    public void dequeue()  {
        if(front == null) { //empty list
            System.out.println("Queue is empty");
        } else {
            System.out.println("Serving customer : " + front.customer.name + " with Ticket number: " + front.customer.ticketNumber);
            if(front == rear ) { //only one customer in the queue
                front = null;
                rear = null;
            } else {
                front = front.next;
            }
            size--;
        }
    }

    public void displayQueue() {
        if(front == null) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Queue: ");
            Node current = front;
            while(current != null) { //until the end of the list
                System.out.println("Customer: " + current.customer.name + " Ticket Number: " + current.customer.ticketNumber);
                current = current.next;
            }
        }
    }

    public void displayQueueSize() {
        System.out.println("Number of customers in the queue: " + this.size);
    }
}
