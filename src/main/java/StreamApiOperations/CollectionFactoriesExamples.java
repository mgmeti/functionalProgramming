package StreamApiOperations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionFactoriesExamples {

    static void createListUsingNewKeyword(){
        // create a simple list
        List<String> friends = new ArrayList<>();
        friends.add("Ram");
        friends.add("Ranga");
        friends.add("Raj");

        System.out.println(friends);
    }

    static void createListUsingArrays(){
        // More convenient way for small list
        List<String> friendsWithAsList = Arrays.asList("Ram","Ranga", "Raj");
        System.out.println(friendsWithAsList);
//        friendsWithAsList.add("Ramesh"); // throws java.lang.UnsupportedOperationException
        System.out.println(friendsWithAsList);
    }

    static void createListUsingStreamApi(){
        List<Integer> nums = Stream.of(1, 2, 3, 4, 3, 2, 1)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(nums);

    }



    public static void main(String[] args) {
        createListUsingNewKeyword();
        createListUsingArrays();
        createListUsingStreamApi();
    }
}
