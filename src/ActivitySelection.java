import java.util.Arrays;

public class ActivitySelection {
    public static int maxActivities(int[] start, int[] end) {
        int n = start.length;

        // Pair indices for sorting based on end times
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = end[i];
        }

        // Sort by end times
        Arrays.sort(activities, (a, b) -> Integer.compare(a[1], b[1]));

        // Select the first activity
        int count = 1;
        int lastEndTime = activities[0][1];

        // Iterate through the rest of the activities
        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastEndTime) {
                count++;
                lastEndTime = activities[i][1]; // Update the end time
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Example test case
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};

        int result = maxActivities(start, end);
        System.out.println("Maximum number of activities: " + result);
    }
}
