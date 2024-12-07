public class FibonacciDP {
    public static int fib(int n) {
        // If n is 0 or 1, return n (base case)
        if (n == 0) return 0;
        if (n == 1) return 1;

        // Variables to store the previous two Fibonacci numbers
        int prev2 = 0, prev1 = 1;

        // Loop to calculate the Fibonacci numbers up to n
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2; // Current Fibonacci number
            prev2 = prev1; // Update prev2 to be the last prev1
            prev1 = current; // Update prev1 to be the current Fibonacci number
        }

        return prev1; // The nth Fibonacci number is now in prev1
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(fib(2));  // Output: 1
        System.out.println(fib(3));  // Output: 2
        System.out.println(fib(4));  // Output: 3
        System.out.println(fib(8));  // Output: 3
        System.out.println(fib(7));  // Output: 3
    }
}

