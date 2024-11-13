package StreamApiOperations;

import java.util.Random;

public class RandomNumbersExamples {

    static void printSortedRandomNumbers(){
        Random random = new Random();
        random.ints()
                .limit(5)
                .sorted()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printSortedRandomNumbers();

    }
}
