package streams;

import repo.Person;
import repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExample {
    public static void main(String[] args) {
//        Stream<Integer> s1= Stream.of(1,2,3,4,5,6);
//        s1.forEach(p-> System.out.println(p));
//        System.out.println("------------------------------");
//
//
//        Stream<Integer> s2=Stream.of(new Integer[]{1,2,3,4,5,6});
//        s2.forEach(p-> System.out.println(p));

        Predicate<Person> p1=(per)->per.getHeight()>=140;
        Predicate<Person>p2=per->per.getGender().equals("Male");

        Map<String, List<String>> personMap= PersonRepository.getAllPersons()
                .stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors
                        .toMap(Person::getName,Person::getHobbies));
        System.out.println(personMap);

        List<String> personHobbies=PersonRepository.getAllPersons()//list of persons
                .stream()//stream of persons
                .map(Person::getHobbies)//Stream<List<String>>
                .flatMap(List::stream)//stream<String>
                .distinct()
                .collect(Collectors.toList());//collection to be returned

        System.out.println(personHobbies);
    }
}
