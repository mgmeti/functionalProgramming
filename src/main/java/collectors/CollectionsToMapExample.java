package collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsToMapExample {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book(1, "Modern Java Recipes", 49.99),
                new Book(2, "Java 8 in Action", 49.99),
                new Book(3, "Java SE8 for the Really Impatient", 39.99),
                new Book(4, "Functional Programming in Java", 27.64),
                new Book(5, "Making Java Groovy", 45.99),
                new Book(6, "Gradle Recipes for Android", 23.76)
        );

        // get map with book id as key and Book instance as value
        Map<Integer, Book>  booksMap = books.stream()
                .collect(Collectors.toMap(Book::getId, b -> b));

        System.out.println(booksMap);

    }
}

class  Book{
    private int id;
    private String name;
    private double price;

    public Book(int id, String name, double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    public int getId() {
        return this.id;
    }
}
