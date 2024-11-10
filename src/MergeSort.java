import java.util.Arrays;

public class MergeSort {

    // Merge Sort function
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return; // Base case: array is already sorted if it has 0 or 1 elements
        }

        int mid = array.length / 2;  // Find the middle index
        int[] left = new int[mid];    // Create the left subarray
        int[] right = new int[array.length - mid]; // Create the right subarray

        // Copy data into the left and right subarrays
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Recursively sort both subarrays
        mergeSort(left);
        mergeSort(right);

        // Merge the sorted subarrays
        merge(array, left, right);
    }

    // Merge two sorted subarrays into the original array
    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the left and right subarrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy remaining elements from left, if any
        while (i < left.length) {
            array[k++] = left[i++];
        }

        // Copy remaining elements from right, if any
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Main method to test the Merge Sort
    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        System.out.println(Arrays.toString(array));

        mergeSort(array); // Perform Merge Sort

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(array));
    }

}
