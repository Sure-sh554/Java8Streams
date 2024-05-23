package MethodReference;

import repo.Person;
import repo.PersonRepository;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample1 {
    static Function<String,String> f1=name->name.toUpperCase();
    static Function<String,String> f2=String::toUpperCase;

    static Predicate<Person> p1=per->per.getHeight()>=140;
    static Predicate<Person> p2=MethodReferenceExample1::heightCheck;

    public static void main(String[] args) {
        System.out.println("Lambda Expression Result"+f1.apply("java8"));
        System.out.println("Method Reference Result"+f2.apply("java8"));

        System.out.println("Predicate Result:"+p2.test(PersonRepository.getPerson()));

    }
    static boolean heightCheck(Person per){
        return per.getHeight()>=140;
    }


}
