package functionalInterfaces.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static void consumerExample(){
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Hey this is consumer");
    }
    static void consumerChaining(){
        // Define two consumers
        Consumer<String> firstConsumer = s -> System.out.println( "First consumer: " + s);
        Consumer<String> secondConsumer = s -> System.out.println("Second consumer: "+ s.toUpperCase());

        // Chain consumers
        Consumer<String> combinedConsumer = firstConsumer.andThen(secondConsumer);
        combinedConsumer.accept("This is example of Consumer chaining");
    }

    static void consumerExampleWithMethodReference(){
        // Define a consumer
        Consumer<String> printConsumer = System.out::println;
        printConsumer.accept("Hey, method reference..");
    }

    static void listWithConsumerInForEach(){
        // Define a small list
        List<String> numbers = Arrays.asList("One", "Two", "Three");
        Consumer<String> printConsumer = System.out::println;
        numbers.forEach(printConsumer);
    }


    public static void main(String[] args) {
//        consumerExample();
//        consumerChaining();
//        consumerExampleWithMethodReference();

        listWithConsumerInForEach();
    }
}

