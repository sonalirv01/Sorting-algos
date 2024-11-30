public class CoinChange {
    public static int coinChange(int[] coins, int amount) {
        // Create a DP array with a size of amount + 1
        int[] dp = new int[amount + 1];
        int[] coinUsed = new int[amount + 1]; // To track the coins used

        // Initialize the dp array with a large value (representing infinity)
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        // Base case: 0 coins are needed to make amount 0
        dp[0] = 0;

        // Iterate over each coin
        for (int coin : coins) {
            // Update the dp array for all amounts that are greater than or equal to the coin's value
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    if (dp[i] > dp[i - coin] + 1) {
                        dp[i] = dp[i - coin] + 1;
                        coinUsed[i] = coin; // Track the coin used
                    }
                }
            }
        }

        // If dp[amount] is still Integer.MAX_VALUE, it means the amount cannot be made
        if (dp[amount] == Integer.MAX_VALUE) {
            System.out.println("Coins used: None");
            return -1;
        }

        // Trace back to find which coins were used
        int remainingAmount = amount;
        System.out.print("Coins used: ");
        while (remainingAmount > 0) {
            int coin = coinUsed[remainingAmount];
            System.out.print(coin + " ");
            remainingAmount -= coin;
        }
        System.out.println(); // For newline

        return dp[amount]; // Return the fewest number of coins
    }

    public static void main(String[] args) {
        // Test case 1: Coins = [1, 2, 5], Amount = 11
        int[] coins1 = {1, 2, 3};
        int amount1 = 11;
        System.out.println("Fewest coins for amount " + amount1 + ": " + coinChange(coins1, amount1));
        // Output: Coins used: 5 5 1

        // Test case 2: Coins = [2], Amount = 3
        int[] coins2 = {2,1};
        int amount2 = 3;
        System.out.println("Fewest coins for amount " + amount2 + ": " + coinChange(coins2, amount2));
        // Output: Coins used: None

        // Test case 3: Coins = [1], Amount = 0
        int[] coins3 = {1};
        int amount3 = 0;
        System.out.println("Fewest coins for amount " + amount3 + ": " + coinChange(coins3, amount3));
        // Output: Coins used: None
    }
}
