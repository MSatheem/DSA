package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //printing the empty list
        list.printList();


        //insert to the head of the list
        list.insertToHead(50); //50
        //deleting elements from the end

        list.printList();
        list.insertToHead(20); //20 --> 50
        list.insertToHead(30); //30 --> 20 --> 50

        //printing the list
        list.printList();

        //inserting to the end of the list
        list.insertToEnd(35); //30 --> 20 --> 50 --> 35
        list.insertToEnd(40); //30 --> 20 --> 50 --> 35 --> 40

        //printing the list
        list.printList();

        //inserting after a particular element
        list.insertAfterElement(20, 100); //30 --> 20 --> 100--> 50 --> 35 --> 40

        //printing the list
        list.printList();

        //particular element not found
        list.insertAfterElement(55,60); //no changes to the linked list

        //printing the list
        list.printList();

        //searching elements
        list.search(30); //element in the list
        list.search(40); //last element in the list
        list.search(10); //element not in the list

        //deleting elements from head
        list.deleteFromHead();  //20 --> 100--> 50 --> 35 --> 40
        //printing the list after deletion
        list.printList();


        //deleting elements from the end
        list.deleteFromLast(); //20 --> 100--> 50 --> 35
        //printing the list after deletion
        list.printList();
    }
}
