import java.util.Arrays;

public class Fibbo {
    public int fib(int n) {
        int [] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return fib(n, dp);
    }

    private int fib(int n , int dp[]){
        System.out.println(n);
        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);

        return dp[n];
    }
}