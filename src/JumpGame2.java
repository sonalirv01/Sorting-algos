public class JumpGame2 {
    public int jump(int[] nums) {
        int jumps = 0;         // Counts the number of jumps
        int currentEnd = 0;    // The end of the current jump range
        int farthest = 0;      // The farthest point reachable

        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]); // Update the farthest point

            if (i == currentEnd) { // If we reach the end of the current jump range
                jumps++;           // Increment the jump count
                currentEnd = farthest; // Update the current jump range to the farthest point
            }
        }

        return jumps; // Return the total number of jumps
    }

    public static void main(String[] args) {
        JumpGame2 solution = new JumpGame2();

        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Input: [2, 3, 1, 1, 4]");
        System.out.println("Output: " + solution.jump(nums1)); // Expected output: 2

        int[] nums2 = {2, 3, 0, 1, 4};
        System.out.println("Input: [2, 3, 0, 1, 4]");
        System.out.println("Output: " + solution.jump(nums2)); // Expected output: 2
    }
}
