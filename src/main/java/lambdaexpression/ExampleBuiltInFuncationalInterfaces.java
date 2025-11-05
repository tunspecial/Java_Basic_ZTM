package lambdaexpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleBuiltInFuncationalInterfaces {
    public static void main(String[] args) {
        SupplierExample se = new SupplierExample();
        se.get();
        
        Supplier<String> s1 = () -> "Hello" ;
        System.out.println(s1);

        Consumer<String> c1 = s -> System.out.println("Hello Consumar");
        c1.accept("From Consumar");

        Predicate<String> p1 = s -> s.length() < 5 ;
        System.out.println(p1.test("Hellow EveryBody"));

        Function<String , Integer > f1 = s -> s.length();
        System.out.println(f1.apply("Helloooooo"));
    }
}
