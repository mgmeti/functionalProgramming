package functionalInterfaces.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class SortingWithComparatorExample {

    private static final List<String> sampleStrings = Arrays.asList("this", "is", "a", "list", "of", "strings", "aa", "aaaa");

    /**
     * The static sort method on Collections takes a List as an argument, but returns void.
     * The sort is destructive, modifying the supplied collection.     *
     */
    public  static List<String> defaultSort(){
        Collections.sort(sampleStrings); // returns void
        return sampleStrings;
    }

    public static List<String> defaultSortUsingStreams(){
        return sampleStrings.stream().sorted().collect(toList());
    }

    public static List<String> lengthSortUsingSorted(){
        return sampleStrings.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(toList());
    }

    public static List<String> lengthSortUsingComparator(){
        return sampleStrings.stream()
                .sorted(comparingInt(String::length))
                .collect(toList());
    }

    public static List<String> lengthSortThenAlphaSort(){
        return sampleStrings.stream()
                .sorted(comparingInt(String::length)
                        .thenComparing(naturalOrder()))
                .collect(toList());
    }

    public static void main(String[] args) {

        System.out.println(defaultSort());
        System.out.println(defaultSortUsingStreams());
        System.out.println(lengthSortUsingSorted());
        System.out.println(lengthSortUsingComparator());
        System.out.println(lengthSortThenAlphaSort());

    }
}
