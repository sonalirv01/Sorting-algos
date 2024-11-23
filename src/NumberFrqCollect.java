import  java.util.*;
import java.util.stream.Collectors;

public class NumberFrqCollect {
    public static void main(String[] args) {
                    List<Integer> numbers = Arrays.asList(1, 5, 3, 1, 9, 3, 2, 4, 5);

            // Using Java 8 Streams to count frequency of each number
            Map<Integer, Long> frequencyMap = numbers.stream()
                    .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

            // Printing the result
            frequencyMap.forEach((key, value) -> System.out.println(key + " -> " + value));

    }
}
