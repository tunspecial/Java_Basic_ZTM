package functionalprogramming.exercise;

import java.util.Arrays;
import java.util.List;

public class LoopToForEachExample {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("hello" , "world" , "functional" , "programming");
        // Using with For Loop
        for (String s : lists){
            System.out.println(s);
        }
        // Using foreach and a lambda experssion
        lists.forEach(e -> System.out.println(e));

    }
}
