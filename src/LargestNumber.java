import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    // Custom comparator to compare two numbers
    public static String largestNumber(int[] nums) {
        // Convert numbers to strings
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // Sort strings based on custom comparator
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // Compare concatenated values of a + b and b + a
                return (b + a).compareTo(a + b); // Reverse order for descending sort
            }
        });

        // If the highest number is "0", return "0" (edge case)
        if (strs[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating the strings
        StringBuilder largestNumber = new StringBuilder();
        for (String str : strs) {
            largestNumber.append(str);
        }

        return largestNumber.toString();
    }

    public static void main(String[] args) {
        // Test case 1: nums = [3, 30, 34, 5, 9]
        int[] nums1 = {3, 30, 34, 5, 9};
        System.out.println("Largest Number: " + largestNumber(nums1)); // Output: "9534330"

        // Test case 2: nums = [0, 0, 0]
        int[] nums2 = {0, 0, 0};
        System.out.println("Largest Number: " + largestNumber(nums2)); // Output: "0"

        // Test case 3: nums = [1, 10, 100, 1000]
        int[] nums3 = {1, 10, 100, 1000};
        System.out.println("Largest Number: " + largestNumber(nums3)); // Output: "1101001000"
    }
}
