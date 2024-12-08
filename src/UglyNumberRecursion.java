public class UglyNumberRecursion {

        public boolean isUgly(int n) {
            if (n <= 0) return false;

            // Function to divide by a given prime factor until it's no longer divisible
            int[] primes = {2, 3, 5};

            for (int prime : primes) {
                n = divideByPrime(n, prime);
            }

            // If after dividing by 2, 3, and 5, n becomes 1, it's an ugly number
            return n == 1;
        }

    // Helper method to divide n by prime as much as possible
    private int divideByPrime(int n, int prime) {
        while (n % prime == 0) {
            n /= prime;
        }
        return n;
    }
    public static void main(String[] args) {
        UglyNumberRecursion unr = new UglyNumberRecursion();
        int[] testNumbers = {3, -1, 6, 14};

        for (int num : testNumbers) {
            if (unr.isUgly(num)) {
                System.out.println(num + " is an ugly number: Yes");
            } else {
                System.out.println(num + " is an ugly number: No");
            }
        }
    }

}
