public class UglyNumberDP {

        public boolean isUgly(int n) {
            if (n <= 0) return false;

            // Generate ugly numbers using DP approach
            int[] dp = new int[n + 1];
            dp[0] = 1;  // 1 is considered an ugly number
            int i2 = 0, i3 = 0, i5 = 0;
            int next2 = 2, next3 = 3, next5 = 5;

            for (int i = 1; i <= n; i++) {
                // The next ugly number is the minimum of the next multiples of 2, 3, and 5
                dp[i] = Math.min(next2, Math.min(next3, next5));

                if (dp[i] == next2) {
                    i2++;
                    next2 = dp[i2] * 2;  // Update next multiple of 2
                }
                if (dp[i] == next3) {
                    i3++;
                    next3 = dp[i3] * 3;  // Update next multiple of 3
                }
                if (dp[i] == next5) {
                    i5++;
                    next5 = dp[i5] * 5;  // Update next multiple of 5
                }
            }

            // Check if n is an ugly number
            for (int i = 1; i <= n; i++) {
                if (dp[i] == n) {
                    return true;
                }
            }

            return false; // If n is not in the list of generated ugly numbers
        }

    public static void main(String[] args) {
        UglyNumberDP undp = new UglyNumberDP();
        int[] testNumbers = {3, -1, 6, 14};

        for (int num : testNumbers) {
            if (undp.isUgly(num)) {
                System.out.println(num + " is an ugly number: Yes");
            } else {
                System.out.println(num + " is an ugly number: No");
            }
        }
    }
}
