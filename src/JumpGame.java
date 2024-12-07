public class JumpGame {
    public boolean canJump(int[] nums) {
        int maxJump = 0;

        for (int i = 0; i <= maxJump; i++) {
            maxJump = Math.max(maxJump, i + nums[i]);
            if (maxJump >= nums.length - 1) {
                return true;
            }
        }

        return false; // If the loop ends, the last index is unreachable
    }

    public static void main(String[] args) {
        JumpGame solution = new JumpGame();

        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println("Input: [3,2,1, 0, 0]");
        System.out.println("Output: " + solution.canJump(nums1)); // Expected output: true

        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println("Input: [3, 2, 1, 0, 4]");
        System.out.println("Output: " + solution.canJump(nums2)); // Expected output: false

    }
}
