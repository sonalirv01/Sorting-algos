public class LinearSearch {
    public static int linearSearch(int[] arr, int search) {
        // Traverse through all elements of the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    // Main function to test the linear search
    public static void main(String[] args) {
        int[] arr = { 5, 3, 7, 1, 9, 2 };
        int search = 7;

        int result = linearSearch(arr, search);
        if (result == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
