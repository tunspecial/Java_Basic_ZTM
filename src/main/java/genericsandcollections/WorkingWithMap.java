package genericsandcollections;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMap {
    public static void main(String[] args) {
        Map<String , Integer> nameAgemaps = new HashMap<>();

        nameAgemaps.put("Ko Ko", 24);
        nameAgemaps.put("Ma Ma", 30);
        nameAgemaps.put("Mg Mg", 25);

        System.out.println(nameAgemaps);

        for (Integer i :  nameAgemaps.values()){
            System.out.println(i);
        
        }
        
        for (String s : nameAgemaps.keySet()){
            System.out.println(s + " : " + nameAgemaps.get(s));
        }

        for (Map.Entry<String , Integer> entry : nameAgemaps.entrySet()){
            System.out.println(entry.getKey());
        }

        nameAgemaps.remove("Ko Ko");
        nameAgemaps.put("Ma Ma", 35);
        System.out.println(nameAgemaps);
    }   
}
