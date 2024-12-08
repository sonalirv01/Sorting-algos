import java.util.Arrays;public class Solution {



        public int minCoins(int[] coins, int sum) {
            // Sort the coins in ascending order
            Arrays.sort(coins);
            int count = 0;

            // Iterate through coins from largest to smallest denomination
            for (int i = coins.length - 1; i >= 0; i--) {
                int denom = coins[i];

                // Use as many of the current denomination as possible
                while (sum >= denom) {
                    sum -= denom;
                    count++;
                }
            }

            // If the remaining sum is zero, return the count
            if (sum == 0) {
                return count;
            }

            // If the sum cannot be achieved, return -1
            return -1;
        }

        public static void main(String[] args) {
            Solution coinChange = new Solution();

            int[] coins1 = {936,917,205,483,345,307,117,20,679,1};
            int sum1 = 662;
            System.out.println("Minimum coins needed for " + sum1 + ": " + coinChange.minCoins(coins1, sum1));
            // Expected Output: 3 (5 + 5 + 1)

            // Test case 2: Coins = [2], Sum = 3
            int[] coins2 = {2};
            int sum2 = 3;
            System.out.println("Minimum coins needed for " + sum2 + ": " + coinChange.minCoins(coins2, sum2));
            // Expected Output: -1 (cannot make 3 with coins of denomination 2)

            // Test case 3: Coins = [1, 5, 10, 25], Sum = 30
            int[] coins3 = {1, 5, 10, 25};
            int sum3 = 30;
            System.out.println("Minimum coins needed for " + sum3 + ": " + coinChange.minCoins(coins3, sum3));
            // Expected Output: 2 (25 + 5)

            // Test case 4: Coins = [1, 3, 4], Sum = 6
            int[] coins4 = {1, 3, 4};
            int sum4 = 6;
            System.out.println("Minimum coins needed for " + sum4 + ": " + coinChange.minCoins(coins4, sum4));
            // Expected Output: 2 (3 + 3)
        }
    }


