import java.util.Arrays;

public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);

        int greedIndex = 0; // Index for children
        int cookieIndex = 0; // Index for cookies

        // While there are children and cookies to consider
        while (greedIndex < g.length && cookieIndex < s.length) {
            if (s[cookieIndex] >= g[greedIndex]) {
                // Assign the cookie to the child
                greedIndex++;
            }
            // Move to the next cookie
            cookieIndex++;
        }

        return greedIndex; // Number of content children
    }

    public static void main(String[] args) {
        AssignCookies solution = new AssignCookies();

        // Example 1
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println("Output: " + solution.findContentChildren(g1, s1)); // Output: 1

        // Example 2
        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println("Output: " + solution.findContentChildren(g2, s2)); // Output: 2
    }

}
