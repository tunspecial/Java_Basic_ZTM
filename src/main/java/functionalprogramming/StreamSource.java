package functionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamSource {
    public static void main(String[] args) {

        // create a stream from collection
        List<String> names = Arrays.asList("KoKO" , "Ma Ma" , "Mg Mg");
        Stream<String> namesStream = names.stream();
        System.out.println(namesStream.count());

        // create a stream from array
        String[] namesArray = {"Ko ko" , "Ma Ma" , "Mg Mg"};
        Stream<String> namesArrayStream = Arrays.stream(namesArray);
        System.out.println(namesArrayStream.findFirst());

        // create a stream usning Stream.interate() method
         Stream<Integer> infiniteStream = Stream.iterate(0, n -> n +1);
         System.out.println(infiniteStream.findAny());

        // create a stream using Stream.generate() method
        Stream<Double> randomNumber = Stream.generate(Math::random);
        System.out.println(randomNumber.getClass());
    }   
}
