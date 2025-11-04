package genericsandcollections;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSet {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();

        number.add(0);
        number.add(10);
        number.add(100);
        number.add(10);
        System.out.println(number);

        for (Integer i : number){
            System.out.println(i);
        }
        
    }
}
