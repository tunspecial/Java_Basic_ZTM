package functionalprogramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("hello" , "world" , "functional" , "programming");
        List<String> toUpperCaseName = names.stream()
            .map(String::toUpperCase) // convert each string in the list to uppercase
            .collect(Collectors.toList()); // use collect to get the new list.
            System.out.println(toUpperCaseName);
    }
}
