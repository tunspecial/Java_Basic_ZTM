package genericsandcollections;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("eggs");
        shoppingList.add("pasta");
        shoppingList.add("banana");

        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(10);
        number.add(100);

        System.out.println(shoppingList);
        System.out.println(number);

        System.out.println(shoppingList.get(1));

        shoppingList.remove("pasta");

        System.out.println(shoppingList);
        
        boolean containBananas = shoppingList.contains("banana");
        System.out.println(containBananas);
    }
}
