package collectors;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollectionExamples {

    public static List<String> createListUsingStream(){
     return  Stream.of("Mr. Furious", "The Blue Raja", "The Shoveler",
                                "The Bowler", "Invisible Boy", "The Spleen", "The Sphinx")
                        .collect(Collectors.toList());

    }

    public static Set<String> createSetUsingStream(){
        return   Stream.of("Casanova Frankenstein", "The Disco Boys",
                "The Not-So-Goodie Mob", "The Suits", "The Suzies",
                "The Furriers", "The Furriers")
                .collect(Collectors.toSet());

    }

    public static List<String> createLinkedListUsingStream(){
        return  Stream.of("Hank Azaria", "Janeane Garofalo", "William H. Macy",
                                "Paul Reubens", "Ben Stiller", "Kel Mitchell", "Wes Studi")
                        .collect(Collectors.toCollection(LinkedList::new));
    }

    public static String[] createArrayUsingStream(){
        return Stream.of("The Waffler", "Reverse Psychologist", "PMS Avenger")
                .toArray(String[]::new);
    }

    public static void main(String[] args) {

        System.out.println(createListUsingStream());
        System.out.println(createSetUsingStream());
        System.out.println(createLinkedListUsingStream());
        System.out.println(createArrayUsingStream().length);

    }
}
