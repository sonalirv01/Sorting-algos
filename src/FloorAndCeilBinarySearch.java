import java.util.Arrays;

public class FloorAndCeilBinarySearch {

    public static int[] findFloorAndCeil(int[] arr, int x) {
        // Step 1: Sort the array
        Arrays.sort(arr);

        // Step 2: Initialize variables
        int floor = -1;
        int ceil = -1;

        // Step 3: Binary search for floor
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == x) {
                floor = ceil = arr[mid]; // Exact match found
                return new int[]{floor, ceil};
            } else if (arr[mid] < x) {
                floor = arr[mid];  // Update floor to arr[mid]
                left = mid + 1;    // Search the right half
            } else {
                ceil = arr[mid];   // Update ceil to arr[mid]
                right = mid - 1;   // Search the left half
            }
        }

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 2, 9, 12,20};

        // Test cases with varying 'x'
        System.out.println("For x = 5: " + Arrays.toString(findFloorAndCeil(arr, 5)));  // Output: [5, 5]
        System.out.println("For x = 10: " + Arrays.toString(findFloorAndCeil(arr, 10))); // Output: [9, 12]
        System.out.println("For x = 1: " + Arrays.toString(findFloorAndCeil(arr, 1)));  // Output: [-1, 2]
        System.out.println("For x = 18: " + Arrays.toString(findFloorAndCeil(arr, 18))); // Output: [12,20]
    }
}
