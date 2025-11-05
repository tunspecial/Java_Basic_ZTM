package functionalprogramming;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ExampleMethodReference {
    public static void main(String[] args) {

        // reference to static method
        // Function<Integer , String> nrToHexString =  i -> Integer.toHexString(i);
        Function<Integer , String> nrToHexStringMethodExample = Integer::toHexString;
        System.out.println(nrToHexStringMethodExample.apply(415));

        // reference to a instance method of a particular object
        String prefix = "Hello! :";
        // Function<String , String> greet = s -> s + prefix;
        Function<String , String> greetMethodReferece = prefix :: concat;
        System.out.println(greetMethodReferece.apply(" World!"));

        // reference to a instance method arbitary object of a particular type
        // BiFunction<String , String , Integer> stringComparator = (s1 , s2) -> s1.compareToIgnoreCase(s2);
        BiFunction<String , String , Integer> stringCompratorMethodReference = String::compareToIgnoreCase;
        System.out.println(stringCompratorMethodReference.apply("hi" , "HI")); 

        //reference to a constructor
        Supplier<ArrayList<String>> supplierList = ArrayList::new;
        ArrayList<String> name = supplierList.get();
        name.add("Hello Tun Tun");
        System.out.println(name.get(0));
    }
}
