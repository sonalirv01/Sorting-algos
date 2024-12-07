import java.util.Arrays;

public class ClimbStairs {
    public static int climbStairs(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;

        // Recursive call for the (n-1)th and (n-2)th steps
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));  // Output: 2
        System.out.println(climbStairs(3));  // Output: 3
        System.out.println(climbStairs(10));  // Output: 5
    }
}

//class SolutionDV {
//    public int climbStairs(int n) {
//        int [] dp = new int[n + 1];
//        Arrays.fill(dp, -1);
//        return climbStairs(n, dp);
//    }
//    private int climbStairs(int n , int [] dp){
//        if(n < 0){
//            return 0;
//        }
//        if(n == 0){
//            return 1;
//        }
//        if(dp[n] != -1){
//            return dp[n];
//        }
//        dp[n] = climbStairs(n - 1, dp) + climbStairs(n - 2, dp);
//        return dp[n];
//    }
//}
