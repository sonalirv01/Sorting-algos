public class Tiling {

    public static int numberOfWays(int n) {
        // Base cases
        if (n == 1) return 1;
        if (n == 2) return 2;

        // Initialize variables for storing the results of the last two computations
        int prev1 = 2; // ways(2)
        int prev2 = 1; // ways(1)

        // Compute the result iteratively for n > 2
        int current = 0;
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        System.out.println(numberOfWays(3)); // Output: 3
        System.out.println(numberOfWays(4)); // Output: 5
    }
}
