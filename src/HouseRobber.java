
public class HouseRobber {
    static int maxLoot(int[] houseMoney) {
        int n = houseMoney.length;

        if (n == 0)
            return 0;
        if (n == 1)
            return houseMoney[0];

        // Set previous 2 values
        int secondLast = 0, last = houseMoney[0];

        // Compute current value using previous
        // two values. The final current value
        // would be our result
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(houseMoney[i] + secondLast, last);
            secondLast = last;
            last = res;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] houseMoney = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(maxLoot(houseMoney));
        int[] houseMoney2Street = {1, 3, 1, 6};
        System.out.println(maxLoot(houseMoney2Street));
    }
}
