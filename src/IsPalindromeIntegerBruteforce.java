public class IsPalindromeIntegerBruteforce {
    
    public static boolean isPalindrome(int x) {
        // If number is negative, it's not a palindrome
        if (x < 0) {
            return false;
        }

        // Convert number to string
        String original = String.valueOf(x);
        
        // Reverse the string
        String reversed = new StringBuilder(original).reverse().toString();
        
        // Check if the original and reversed strings are equal
        return original.equals(reversed);
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;
        IsPalindromeIntegerBruteforce sol=new IsPalindromeIntegerBruteforce();
        System.out.println(num1 + " is palindrome? " + sol.isPalindrome(num1)); // true
        System.out.println(num2 + " is palindrome? " + sol.isPalindrome(num2)); // false
        System.out.println(num3 + " is palindrome? " + sol.isPalindrome(num3)); // false
    }
    
    
}
