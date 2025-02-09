public class isPalindromeIntegerStringMethod {
    public boolean isPalindrome(int x) {
        String numStr = String.valueOf(x); // Convert number to string
        int i = 0, j = numStr.length() - 1;

        while (i < j) {
            if (numStr.charAt(i) != numStr.charAt(j)) {
                return false; // Mismatch found, not a palindrome
            }
            i++;
            j--;
        }
        
        return true; // If no mismatches, it's a palindrome
    }

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = -121;
        int num3 = 10;
        isPalindromeIntegerStringMethod sol=new isPalindromeIntegerStringMethod();
        System.out.println(num1 + " is palindrome? " + sol.isPalindrome(num1)); // true
        System.out.println(num2 + " is palindrome? " + sol.isPalindrome(num2)); // false
        System.out.println(num3 + " is palindrome? " + sol.isPalindrome(num3)); // false
    }
    
}
