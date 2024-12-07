public class Fibonacci {
    public static int fib(int n) {
        if (n == 0) {
            return 0; // Base case: F(0) = 0
        } else if (n == 1) {
            return 1; // Base case: F(1) = 1
        }
        return fib(n - 1) + fib(n - 2); // Recursive case
    }

    public static void main(String[] args) {
        int n = 4; // Change this value to test other inputs
        System.out.println("F(" + n + ") = " + fib(n));
    }
}
