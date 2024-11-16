import java.util.Arrays;

public class MergeSort {

    // Merge Sort function
    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // Base case: array is already sorted if it has 0 or 1 elements
        }

        int mid = arr.length / 2;  // Find the middle index
        int[] firstHalf = new int[mid];    // Create the left subarray
        int[] secondHalf = new int[arr.length - mid]; // Create the right subarray

        // Copy data into the left and right subarrays
        System.arraycopy(arr, 0, firstHalf, 0, mid);
        System.arraycopy(arr, mid, secondHalf, 0, arr.length - mid);

        // Recursively sort both subarrays
        mergeSort(firstHalf);
        mergeSort(secondHalf);

        // Merge the sorted subarrays
        merge(arr, firstHalf, secondHalf);
    }

    // Merge two sorted subarrays into the original array
    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Merge the left and right subarrays
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        // Copy remaining elements from left, if any
        while (i < left.length) {
            arr[k++] = left[i++];
        }

        // Copy remaining elements from right, if any
        while (j < right.length) {
            arr[k++] = right[j++];
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
