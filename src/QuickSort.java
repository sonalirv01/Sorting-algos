import java.util.Arrays;

public class QuickSort {

    // Quick Sort function
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before and after the partition
            quickSort(array, low, pivotIndex - 1);  // Sort left of pivot
            quickSort(array, pivotIndex + 1, high); // Sort right of pivot
        }
    }

    // Partition function to place the pivot element in the correct position
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as pivot
        int i = low - 1; // Index for the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                swap(array, i, j);
            }
        }

        // Swap array[i+1] and pivot (array[high])
        swap(array, i + 1, high);

        return i + 1; // Return the partition index
    }

    // Helper function to swap two elements in the array
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Main method to test Quick Sort
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1); // Perform Quick Sort

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }


}
