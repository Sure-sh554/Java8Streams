package Consumer;

import java.util.function.UnaryOperator;

public class UnaryBinaryExample {
    static UnaryOperator<String>uo1=name->name.toUpperCase();

    static UnaryOperator<Integer> uo2=a->a+10;

    public static void main(String[] args) {
        System.out.println(uo1.apply("java"));
        System.out.println(uo2.apply(10));

    }
}
