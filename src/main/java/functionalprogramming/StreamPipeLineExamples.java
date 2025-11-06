package functionalprogramming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPipeLineExamples {
    public static void main(String[] args) {

      
        List<String> names = Arrays.asList("Tun Tun OO" , "Maung Maung" , "Ko Ko Ko" , "Zaw Zaw" , "Ma Ma");
        
         //Examples 1 : Filtering and Collecting a List of Names
        List<String> nameStartWithM = names.stream()
            .filter(name -> name.startsWith("M"))
            .collect(Collectors.toList());
            System.out.println(nameStartWithM);

        // Examples 2 : Finding the Longes Name
        Optional<String> longestName = names.stream()
            .max(Comparator.comparingInt(String::length));
            System.out.println(longestName);

        // Examples 3 : Transforming a list of String into a set of Integers
        Set<Integer> uniqueIntegers = names.stream()
            .map(String::length).distinct()
            .collect(Collectors.toSet());
            System.out.println(uniqueIntegers);

        // Examples 4 : Concatenating straing with a custom separator
        String concatenatedName = names.stream()
            .collect(Collectors.joining(", "));
            System.out.println(concatenatedName);

    }
}
