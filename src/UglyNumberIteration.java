public class UglyNumberIteration {

        public boolean isUgly(int n) {
            // Base case: 1 is considered an ugly number
            if (n <= 0) return false;

            // Keep dividing n by 2, 3, and 5
            while (n % 2 == 0) n /= 2;
            while (n % 3 == 0) n /= 3;
            while (n % 5 == 0) n /= 5;

            // If n becomes 1, it is an ugly number
            return n == 1;
        }

    public static void main(String[] args) {
        UglyNumberIteration unitr = new UglyNumberIteration();
        int[] testNumbers = {3, -1, 6, 14};

        for (int num : testNumbers) {
            if (unitr.isUgly(num)) {
                System.out.println(num + " is an ugly number: Yes");
            } else {
                System.out.println(num + " is an ugly number: No");
            }
        }
    }

}
