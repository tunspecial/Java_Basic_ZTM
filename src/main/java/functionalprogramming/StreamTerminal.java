package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
// import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTerminal {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ko Ko" , "Ma Ma" , "Mg Mg" );
        Stream<String> namesStream = names.stream();

        //for each performs an action for very element in the stream
        namesStream.forEach(System.out::println); 

        // count : returns the number of element in the stream
        // long nrOfItems = names.stream().count();

        // min , max : return mininum and maxinum elements in the stream
        Optional<String> min = names.stream().min((s1 , s2) -> s1.compareToIgnoreCase(s2));
        System.out.println(min.get());

        //allmatch : check if all of the elemment in the stream match a given predicate
        boolean allBiggerThan5  = names.stream().allMatch(s -> s.length() > 3);
        System.out.println("All Bigger Than 5 : " + allBiggerThan5);

        //anyMath : check none of the element in the stream match a given predicate
        boolean anyBiggerThan5 = names.stream().anyMatch((s -> s.length() >3));
        System.out.println("Any Bigger Than 5 : " + anyBiggerThan5);

        //nonematch : check if none of the element in the stream match a given predicate
        boolean noneBiggerThan5 = names.stream().noneMatch((s -> s.length() > 3));
        System.out.println("None Bigger Than 5 : " + noneBiggerThan5);

        // collect : transform a stream into a different data structure , such as List , Set , Map
        // List<String> nameList = names.stream().collect(Collectors.toList());
        // Java 16 ++
        // List<String> nameList2 = names.stream().toList();

        //reduce : applies a binary element to the element in the stream , reducing them to a single value.
        Optional<String> totalString = names.stream().reduce(String:: concat);
        System.out.println(totalString.get());

    }
}
