
    public class AssignCookiesBruteForce {
        public int findContentChildren(int[] g, int[] s) {
            // Keep track of the children who are content
            boolean[] childContent = new boolean[g.length];
            boolean[] cookieUsed = new boolean[s.length];
            int contentChildren = 0;

            // Iterate through each child
            for (int i = 0; i < g.length; i++) {
                // Try to find a cookie for the current child
                for (int j = 0; j < s.length; j++) {
                    // If the cookie is not used and satisfies the child's greed factor
                    if (!cookieUsed[j] && s[j] >= g[i]) {
                        contentChildren++; // This child is now content
                        childContent[i] = true;
                        cookieUsed[j] = true;
                        break; // Move to the next child
                    }
                }
            }

            return contentChildren;
        }

        public static void main(String[] args) {
            AssignCookiesBruteForce assignCookies = new AssignCookiesBruteForce();

            // Example 1
            int[] g1 = {1, 2, 3};
            int[] s1 = {1, 1};
            System.out.println("Output: " + assignCookies.findContentChildren(g1, s1)); // Output: 1

            // Example 2
            int[] g2 = {1, 2};
            int[] s2 = {1, 2, 3};
            System.out.println("Output: " + assignCookies.findContentChildren(g2, s2)); // Output: 2
        }
    }


