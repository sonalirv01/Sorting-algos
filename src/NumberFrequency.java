import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberFrequency {

    public static <T> Map<T, Long> frequencyMap(Stream<T> elements) {
        return elements.collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );
    }

    public static Map<String, Long> caseInsensitiveFrequencyMap(Stream<String> elements) {
        return elements.map(String::toLowerCase) // Normalize to lowercase
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                ));
    }

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 1, 9, 3, 2, 4, 5};
        System.out.println(frequencyMap(Arrays.stream(numbers).boxed()));

        String[] names = {"sonali", "Sonali", "Swati", "Aman"};
        System.out.println(caseInsensitiveFrequencyMap(Arrays.stream(names)));
    }
}
