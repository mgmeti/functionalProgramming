package java9Features;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FeatureEnhancedExample {
    public static void lisFactoryExample(){
        List<String> friends = List.of("Ram", "Ramesh", "Ranga"); // the list that’s produced is immutable.
//        friends.add("Ravi"); // UnsupportedOperationException
        System.out.println(friends);
    }

    public static void setFactoryExample(){
        Set<String> strings = Set.of("A", "B", "C");
        System.out.println(strings);

//        Set<Integer> uniqueNumbers = Set.of(1, 2, 3, 3); // throws IllegalArgumentException because of duplicate element: 3
//        System.out.println(uniqueNumbers);
    }

    public static void setMapExample(){
        Map<String, Integer> ageOfFriends = Map.of("Ram", 25, "Ranga", 26, "Ramesh", 30);
        ageOfFriends.forEach((key, value) -> System.out.printf("%s -> %d%n", key, value));
    }

    public static void main(String[] args) {
        lisFactoryExample();
        setFactoryExample();
        setMapExample();
    }
}
