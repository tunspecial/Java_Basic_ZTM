package genericsandcollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class WorkingWithQueues {
    public static void main(String[] args) {
        Deque<String> Strings = new ArrayDeque<>();
        Strings.add("Java");
        Strings.add("Python");
        Strings.add("C#");

        System.out.println(Strings);

        Strings.pop();

        System.out.println(Strings);

        Strings.addFirst("Java");
        Strings.addLast("Rust");

        System.out.println(Strings);

        System.out.println(Strings.peek());
        System.out.println(Strings);

        System.out.println(Strings.pollLast());
        System.out.println(Strings);
    }

}
