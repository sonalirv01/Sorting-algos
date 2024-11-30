import java.util.Arrays;

public class MinimumPlatforms {
    // Function to find the minimum number of platforms required
    public static int findPlatform(int[] arrival, int[] departure) {
        int n = arrival.length;

        // Sort the arrival and departure arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        // Initialize pointers and variables
        int platformsNeeded = 1;  // At least one platform is needed initially
        int result = 1;           // To store the result
        int i = 1;                // Pointer for arrival times
        int j = 0;                // Pointer for departure times

        // Iterate over the trains' arrival and departure times
        while (i < n && j < n) {
            // If the next train arrives before the last one departs
            if (arrival[i] <= departure[j]) {
                platformsNeeded++;  // We need a new platform
                i++;                // Move to the next arrival
            } else {
                platformsNeeded--;  // A platform is freed
                j++;                // Move to the next departure
            }

            // Update the result if the current platforms needed exceeds the max so far
            result = Math.max(result, platformsNeeded);
        }

        return result;
    }

    public static void main(String[] args) {
        // Example test case
        int[] arrival = {10, 12, 20};
        int[] departure = {20, 25, 30};

        int result = findPlatform(arrival, departure);
        System.out.println("Minimum number of platforms required: " + result);
    }
}
