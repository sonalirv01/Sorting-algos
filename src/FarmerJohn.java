import java.util.*;

public class FarmerJohn {

    // Function to check if it's possible to place cows with at least 'dist' distance apart
    public static boolean canPlaceCows(int[] stalls, int C, int dist) {
        int cowsPlaced = 1;  // Place the first cow in the first stall
        int lastPosition = stalls[0];  // The position of the first cow

        // Try placing the remaining cows
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= dist) {
                cowsPlaced++;
                lastPosition = stalls[i];  // Update last position where a cow is placed
                if (cowsPlaced == C) {
                    return true;  // All cows have been placed successfully
                }
            }
        }
        return false;  // Not all cows could be placed
    }

    // Main function to solve the problem
    public static int findLargestMinimumDistance(int[] stalls, int C) {
        Arrays.sort(stalls);  // Sort the stall positions
        int left = 1, right = stalls[stalls.length - 1] - stalls[0];  // Binary search range
        int bestDist = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;  // Middle distance
            if (canPlaceCows(stalls, C, mid)) {
                bestDist = mid;  // Found a valid distance, try for a larger one
                left = mid + 1;
            } else {
                right = mid - 1;  // Try smaller distances
            }
        }

        return bestDist;  // Return the best distance found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // Number of test cases

        while (t-- > 0) {
            int N = scanner.nextInt();  // Number of stalls
            int C = scanner.nextInt();  // Number of cows

            int[] stalls = new int[N];
            for (int i = 0; i < N; i++) {
                stalls[i] = scanner.nextInt();
            }

            // Find and print the largest minimum distance for each test case
            System.out.println(findLargestMinimumDistance(stalls, C));
        }

        scanner.close();
    }
}

