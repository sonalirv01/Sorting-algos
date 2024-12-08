public class TilingProblem {
    public int numberOfWays(int n) {
        final int MOD = 1000000007;

        if (n == 1) return 1; // Base case
        if (n == 2) return 2; // Base case

        int prev2 = 1; // dp[i-2]
        int prev1 = 2; // dp[i-1]
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = (prev1 + prev2) % MOD; // dp[i] = dp[i-1] + dp[i-2]
            prev2 = prev1; // Update dp[i-2] to dp[i-1]
            prev1 = current; // Update dp[i-1] to dp[i]
        }

        return current;
    }

    public static void main(String[] args) {
        TilingProblem tp = new TilingProblem();
        System.out.println(tp.numberOfWays(3)); // Output: 3
        System.out.println(tp.numberOfWays(4)); // Output: 5
    }

}
