public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindrome
            int len1 = expandAroundCenter(s, i, i);

            // Check for even-length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            // Get the maximum length of palindrome found
            int len = Math.max(len1, len2);

            // Update start and end indices for the longest palindrome
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        // Return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    // Helper function to expand around the center
    private int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // Return the length of the palindrome
        return right - left - 1;
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        System.out.println(lps.longestPalindrome("babad")); // Output: "bab" or "aba"
        System.out.println(lps.longestPalindrome("cbbd"));  // Output: "bb"
    }
}
