package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        //Map is used to transform the data one datatype to another data type
        List<String> fruits= Arrays.asList("Apple","Orange","Banana","PineApple");
        List<Integer> fruitLength=fruits.stream().map(String::length)
                .collect(Collectors.toList());
      //  System.out.println(fruitLength);

        fruits.stream().map(String::length)
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
