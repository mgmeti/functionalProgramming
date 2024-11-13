package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionAndGroupingWithCollectorsExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("this", "is", "a", "long", "list", "of",
                "strings", "to", "use", "as", "a", "demo");

        // split the list into even lengths and odd lengths lists
        Map<Boolean, List<String>> lengthMap = strings.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));
        lengthMap.forEach((key, value) -> System.out.printf("%5s: %s%n", key, value));

        // counting the partitioned strings
        Map<Boolean, Long> numberLengthMap = strings.stream()
                .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0, Collectors.counting()));
        numberLengthMap.forEach((key, value) -> System.out.printf("%s:%d%n", key, value));

        // separate each string by its length
        Map<Integer, List<String>> eachLengthMap = strings.stream()
                .collect(Collectors.groupingBy(String::length));

        eachLengthMap.forEach((key, value) -> System.out.printf("%d:%s%n", key, value));

    }
}
