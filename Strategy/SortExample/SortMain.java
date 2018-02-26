package DesignPatterns.Strategy.SortExample;

public class SortMain {

    public static void main(String... args) {

        // Bubble Sort
        int[] arr1 = {5,1,2,6,3};
        Sort bubbleSort = new BubbleSort();
        bubbleSort.sortAlgorithm.sortArray(arr1);
        printArray(arr1);

        // Insertion Sort
        int[] arr2 = {5,1,2,6,3};
        Sort insertionSort = new InsertionSort();
        insertionSort.sortAlgorithm.sortArray(arr2);
        printArray(arr2);
    }

    public static void printArray(int[] arr) {
        for(int a : arr) {
            System.out.print(a + " ");
        }

        System.out.println();
    }
}