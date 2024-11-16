public class BinarySearchRecursive {

        public static int binarySearch(int[] arr, int target) {
            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Calculate mid to avoid overflow

                if (arr[mid] == target) {
                    return mid; // Target found
                } else if (arr[mid] < target) {
                    left = mid + 1; // Move left to mid + 1
                } else {
                    right = mid - 1; // Move right to mid - 1
                }

            }

            return -1; // Target not found
        }

        public static void main(String[] args) {
            int[] arr = {2, 3, 4, 10, 40};
            int target = 1;
            int result = binarySearch(arr, target);

            if (result == -1) {
                System.out.println("Element not present");
            } else {
                System.out.println("Element found at index: " + result);
            }
        }
    }

