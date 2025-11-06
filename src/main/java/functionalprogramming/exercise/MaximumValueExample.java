package functionalprogramming.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaximumValueExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,101);

        Optional<Integer> max = numbers.stream().max(Integer::compare);
        max.ifPresent(valur -> System.out.println("max value : " + max));
    }
}
