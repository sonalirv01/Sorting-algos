import java.util.Arrays;

public class HouseRobberRecursion {
    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        Arrays.fill(memo, -1); // Initialize with -1
        return robFrom(nums, nums.length - 1, memo);
    }

    private int robFrom(int[] nums, int i, int[] memo) {
        // Base cases
        if (i < 0) return 0;
        if (i == 0) return nums[0];

        // Check if already computed
        if (memo[i] != -1) return memo[i];

        // Recurrence relation
        memo[i] = Math.max(robFrom(nums, i - 1, memo), nums[i] + robFrom(nums, i - 2, memo));
        return memo[i];
    }


    public static void main(String[] args) {
        HouseRobberRecursion hs = new HouseRobberRecursion();
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2, 3, 1};
        int[] nums3 = {5, 2, 3};

        System.out.println("Maximum money that can be robbed (Example 1): " + hs.rob(nums1)); // Output: 3
        System.out.println("Maximum money that can be robbed (Example 2): " + hs.rob(nums2)); // Output: 4
        System.out.println("Maximum money that can be robbed (Example 3): " + hs.rob(nums3)); // Output: 3

    }
}
