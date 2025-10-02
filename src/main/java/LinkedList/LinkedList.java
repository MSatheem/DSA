package LinkedList;

public class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    //insert node to the start of the linked list
    public void insertToHead(int data) {
        //creating the Node to be inserted
        Node newNode = new Node(data);

        //case 1: Empty Linked List
        if(head == null) { //checking
            head = newNode; //head --> newNode
        } else { //case2: If there are any element in the linked list
            newNode.next = head; //newNode --> head
            head = newNode; //head --> newNode
        }
    }

    //method to add node to the end of the linked list
    public void insertToEnd(int data) {
        Node newNode = new Node(data); //creating the Node to be inserted to the end of the linked list
        //case 1 : empty list
        if(head == null) {
            head = newNode;
        } else { //if there is at least one element in the list
            Node current = head; //current = head
            while(current.next != null) { //until the end of the linked list  //lastNode.next == null
                current = current.next; //iterate to next node
            }
            current.next = newNode; //current would be the last node and it's next would point to the newNode
        }

    }


    //deleting element from the head
    public void deleteFromHead() {
        if(head == null) { //empty list
            System.out.println("Empty list");
        } else {
            //head --> firstNode
            head = head.next; //head--> second Node or head-->null if there was only one element
            System.out.println("Node deleted from head"); //A message to be shown
        }
    }

    public void deleteFromLast() {
        //case 1 : empty list
        if(head == null) {
            System.out.println("Empty list");
        } else { //if there is at least one element in the list
            //Case1: only one element in the list
            if(head.next == null) {
                System.out.println("Deleted node " + head.data); //printing the deleted node (optional)
                head = null; //head --> null
            }
            //case2: more than one element
            else {
                Node current = head; //current = head
                while (current.next.next != null) { //Node just before the last element //lastNode.next.next == null
                    current = current.next; //iterate to next node
                }
                System.out.println("Deleted node " + current.next.data); //printing the deleted node (optional)
                current.next = null; //current would be the last node and it's next would point to null instead of the last node existed

            }
        }
    }

    //method to add element after particular node
    public void insertAfterElement(int searchKey, int data) { //searchKey is the element to found
        //case 1: empty list. No element found
        if(head == null) {
            System.out.println("Empty list");
        } else {
            //case 2: if the particular element in the list
            Node newNode = new Node(data);

            //creating the node to be inserted
            Node current = head; //A node to iterate the linked list
            while(current != null) { //until the end of the list
                if(current.data == searchKey) { //node to be find is located current--> nodeToBeFind
                    newNode.next = current.next; //newNode --> current.next i.e.Node after the found element
                    current.next = newNode; //current --> newNode
                    return; //exit the method
                }
                current = current.next; //iterate to the next element
            }
            System.out.println(searchKey + " not found in the list");

        }
    }

    //method to search for an element in the list
    public void search(int searchKey) {
        if(head == null) { //empty linked list
            System.out.println("Empty list there is no elements in the list");
        } else {
            Node current = head; //current --> head
            while(current != null) { //until the end of the list
                if(current.data == searchKey) { //element matches the search key
                    System.out.println(searchKey + " is in the list");
                    return; //exit the method
                }
                current = current.next; //iterate to next node in the list
            }
            //reached the end of the list
            System.out.println(searchKey + " is not found in the list");
        }
    }

    //method to print the linked list
    public void printList() {
        if(head == null) {//list empty?
            System.out.println("Empty list");
        } else { //list is not empty
            Node current = head; //current = head
            while(current != null) { //until the last node in the linked list
                System.out.print(current.data + " ");
                current = current.next; //iterate to next node
            }
            System.out.println();
        }
    }
}
