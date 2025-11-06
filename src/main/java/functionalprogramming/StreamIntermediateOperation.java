package functionalprogramming;

// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Comparator;
// import java.util.List;
// import java.util.stream.Stream;

public class StreamIntermediateOperation {
    public static void main(String[] args) {
        // List<String> names = Arrays.asList("Zaw Zaw" , "Maung Maung" , "Ko Ko" , "Tun Tun Oo");

        //filter : filter the stream base on predicate
        // Stream<String> namesStartWithZ = names.stream().filter((name -> name.startsWith("Z")));
        
        // map : applies the function to each element in the stream
        // Stream<Integer> nameLengths = names.stream().map(String::length);

        //flatmap : applies the function to rech element in the Stream and flattens the resulting stream into a singel stream
        // List<List<String>> nestedNames = Arrays.asList(Arrays.asList("Zaw Zaw" , "Maung Maung"), Arrays.asList("Ko Ko" , "Tun Tun Oo"));
        // Stream<String> flatNames = nestedNames.stream().flatMap(Collection::stream);

        //peek : performs action to each elements in the stream without modifying the stream.
        // Stream<String> namesWithPeek = names.stream().peek(System.out::println);

        //limit : limit to the stream to a certain number of elements.
        // Stream<String> firstThreeNames = names.stream().limit(3);
        
        //skip : skip the first element in the stream.
        // Stream<String> namesWithoutFirst2 = names.stream().skip(3);

        // distinct : remove duplicate element from stream
        // Stream<String> distinctName = names.stream().distinct();

        //sorted : sort the element in the stream according to a comparator
        // Stream<String> sortedName = names.stream().sorted(Comparator.naturalOrder());

    }
}
