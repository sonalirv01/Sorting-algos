import java.util.Arrays;

public class MinArrowsToBurstBalloons {

    // Method to find the minimum number of arrows required to burst all balloons
    public static int findMinArrows(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        // Sort the balloons by their end points
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        // The first arrow is shot at the end of the first balloon
        int arrows = 1;
        int lastEnd = points[0][1];

        // Iterate through the remaining balloons
        for (int i = 1; i < points.length; i++) {
            // If the start of the current balloon is greater than the end of the last shot arrow,
            // we need to shoot a new arrow
            if (points[i][0] > lastEnd) {
                arrows++;
                lastEnd = points[i][1];  // Update the last shot arrow position
            }
        }

        return arrows;
    }

    public static void main(String[] args) {
        // Example test case
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int result = findMinArrows(points);
        System.out.println("Minimum number of arrows required: " + result);
    }
}
