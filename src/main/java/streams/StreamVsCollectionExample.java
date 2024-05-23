package streams;

import repo.Person;
import repo.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
    public static void main(String[] args) {
        //In Collection we can iterate number of times
        List<String> names=new ArrayList<>();
        names.add("John");
        names.add("Adan");
        names.add("Nancy");

        for (String name:names) {
            System.out.println("1"+" "+name);
        }

        for (String name:names) {
            System.out.println("2"+" "+name);
        }
        System.out.println("-----------------------------------");
        Stream<String> stream=names.stream();
        stream.forEach(p-> System.out.println(p));
        //In Streams we cannot iterate mora than once will runtime exception as IllegalStateException
       // stream.forEach(p-> System.out.println(p));

        List<String> personName= PersonRepository.getAllPersons()
                .stream()
                .peek(per-> System.out.println(per))
                .map(Person::getName)
                .peek(System.out::println)
                .collect(Collectors.toList());

    }
}
