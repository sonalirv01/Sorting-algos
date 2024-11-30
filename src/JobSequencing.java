import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {

    // Job class to represent a job
    static class Job {
        char id; // Job ID
        int deadline; // Deadline of job
        int profit; // Profit from job

        // Constructor to initialize job
        public Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    // Function to find the maximum profit and job sequence
    public static void jobSequencing(Job[] jobs, int n) {
        // Sort jobs in descending order of profit
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // To keep track of free time slots
        boolean[] slots = new boolean[n];
        int totalProfit = 0;
        int jobCount = 0;

        // Result to store the job sequence
        char[] jobSequence = new char[n];

        // Traverse through all the jobs
        for (int i = 0; i < n; i++) {
            // Find a free slot for this job (starting from the last possible slot)
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
                // If slot is free
                if (!slots[j]) {
                    slots[j] = true; // Mark this slot as occupied
                    jobSequence[j] = jobs[i].id; // Add job to this slot
                    totalProfit += jobs[i].profit; // Add the profit of this job
                    jobCount++; // Increment the job count
                    break; // Break the loop as we have scheduled this job
                }
            }
        }

        // Print the results
        System.out.println("Number of jobs selected: " + jobCount);
        System.out.println("Total profit: " + totalProfit);
        System.out.print("Job sequence: ");
        for (int i = 0; i < n; i++) {
            if (jobSequence[i] != 0) {
                System.out.print(jobSequence[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        // Create jobs with Job ID, Deadline, and Profit
        Job[] jobs = {
                new Job('A', 4, 20),
                new Job('B', 1, 10),
                new Job('C', 1, 40),
                new Job('D', 1, 30),
                new Job('E', 3, 50)
        };

        int n = jobs.length;

        // Call the function to solve the Job Sequencing Problem
        jobSequencing(jobs, n);
    }
}
