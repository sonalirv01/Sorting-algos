public class isPalindromeIntergerBestApproach {
    public static boolean isPalindrome(int x) {
        // Step 1: Edge cases (negative numbers and numbers ending with 0 but not 0 itself)
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        
        // Step 2: Reverse only half of the number
        while (x > reversedHalf) {
            int digit = x % 10;  // Extract last digit
            reversedHalf = reversedHalf * 10 + digit; // Build reversed half
            x /= 10; // Remove last digit
        }
        
        // Step 3: Compare first half (x) with second half (reversedHalf)
        return x == reversedHalf || x == reversedHalf / 10;
    }
    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;
        isPalindromeIntergerBestApproach sol=new isPalindromeIntergerBestApproach();
        System.out.println(num1 + " is palindrome? " + sol.isPalindrome(num1)); // true
        System.out.println(num2 + " is palindrome? " + sol.isPalindrome(num2)); // false
        System.out.println(num3 + " is palindrome? " + sol.isPalindrome(num3)); // false
    }
}
