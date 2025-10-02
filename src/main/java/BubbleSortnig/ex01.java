package BubbleSortnig;

public class ex01 {
    public static void main(String[] args) {
        int[] arr = {25,57,48,37,12,92,86,33};
        print(arr);
        bubbleSort(arr);
    }

    public static void print(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j< arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Iteration: " + (i+1));
            print(arr);
        }
    }
}
