package Consumer;

import java.util.function.Function;

public class FunctionPersonExample {
    static Function<String,Integer> f1=name->name.length();

    public static void main(String[] args) {
        System.out.println(f1.apply(" java features"));
    }
}
