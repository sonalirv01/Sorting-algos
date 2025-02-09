public class ReverseInteger {
    public int reverse(int x) {

        long reversed = 0;
        
        while (x != 0) {
        
        int digit = x % 10;
        
        reversed = reversed * 10 + digit;
        
        x = x / 10;
        
        }
        
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
        
        return 0;
        
        }
        
        return (int) reversed;
        
        }


        public static void main(String[] args) {
        ReverseInteger sol = new ReverseInteger();
        System.out.println(sol.reverse(123));    // Output: 321
        System.out.println(sol.reverse(-123));   // Output: -321
        System.out.println(sol.reverse(120));    // Output: 21
        System.out.println(sol.reverse(0));      // Output: 0
        System.out.println(sol.reverse(1534236467)); // Output: 0 (Overflow case)
    }

    }
