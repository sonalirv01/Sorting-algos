import java.util.Arrays;
import java.util.Comparator;

class Item {
    int weight;
    int value;

    // Constructor
    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }
}

class FractionalKnapsackProblem {
    // Function to solve the fractional knapsack problem
    public static double getMaxValue(Item[] items, int capacity) {
        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                double r1 = (double) a.value / a.weight;
                double r2 = (double) b.value / b.weight;
                return Double.compare(r2, r1);
            }
        });

        double totalValue = 0.0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                // Take the whole item
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // Take a fraction of the item
                totalValue += ((double) item.value / item.weight) * capacity;
                break; // Knapsack is full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        // Example items
        Item[] items = {
                new Item(10, 60), // weight = 10, value = 60
                new Item(20, 100), // weight = 20, value = 100
                new Item(30, 120) // weight = 30, value = 120
        };

        int capacity = 50; // Knapsack capacity

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in knapsack = " + maxValue);
    }
}
