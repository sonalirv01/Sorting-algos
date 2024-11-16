public class floorIndex {
    static int findFloor(int[] arr, int k) {
        int left = 0, right = arr.length - 1;
        int result = -1; // Default result if no floor exists

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] <= k) {
                result = mid; // Potential floor found, save index
                left = mid + 1; // Search right for a larger floor value
            } else {
                right = mid - 1; // Search left
            }
        }

        return result;

    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 4;
        int result = findFloor(arr, target);

        if (result == -1) {
            System.out.println("Floor not present");
        } else {
            System.out.println("floor  at index: " + result);
        }
    }
}
