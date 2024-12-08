public class CoinExchange {
    public static int minCoins(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        // Initialize dp array with a large value (representing infinity)
        dp[0] = 0;  // 0 coins are needed to make amount 0
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE; // Initialize other values as infinity
        }

        // Dynamic programming to fill dp array
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                if (dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount];  // Return the result for the given amount
    }

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 8, 10, 14};  // Given denominations
        int amount = 1291;  // Target amount

        // Output the minimum number of coins needed
        System.out.println(minCoins(coins, amount));
    }
}
