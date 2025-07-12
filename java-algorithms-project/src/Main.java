public class Main {
    public static void main(String[] args) {
        // Example usage of sorting algorithms
        int[] arrayToSort = {5, 3, 8, 1, 2};
        System.out.println("Original array:");
        Utils.printArray(arrayToSort);

        SortAlgorithms.bubbleSort(arrayToSort);
        System.out.println("Sorted array using Bubble Sort:");
        Utils.printArray(arrayToSort);

        // Example usage of searching algorithms
        int target = 3;
        int index = SearchAlgorithms.binarySearch(arrayToSort, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}