package org.practicalTutorial01;

public class Array {
    public static void main(String[] args) {
        //declare an integer array called marks
        int[] marks;
        //construct the marks array with size of 5 elements
        marks = new int[5];

        //insert elements into the array
        marks[0] = 77;
        marks[1] = 99;
        marks[2] = 44;
        marks[3] = 55;
        marks[4] = 22;

        //keep track of the number of elements in the array using a variable nElements
        int nElements = 5;

        //display the array contents
        for(int i=0; i<nElements; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        //search for an element(66) in the array
        //use a loop to search for the element
        int searchKey = 66;
        for(int i=0; i<nElements; i++) {
            if(searchKey == marks[i]) { //element found
                System.out.println("Found " + searchKey);
                break; //breaking the loop
            }

            if(i == nElements-1) { //i=4 last element in the array
                System.out.println("Can't find " + searchKey);
            }
        }

        //delete an element (55) from the array


    }
}
