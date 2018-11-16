package arrays;

import java.util.HashSet;
import java.util.Set;

public class NewArrayListTest{
    public static void main(String[] args) {
        Set<String> ceritanya = new HashSet<>();
        ceritanya.add("pada suatu hari");
        ceritanya.add("dan pada suatu ketika");
        ceritanya.add("dan pada suatu ketika");
        ceritanya.add("dan pada suatu ketika");
        ceritanya.add("dan pada suatu ketika");
        ceritanya.add("dan pada suatu ketika");
        
        Object[] newValues = ceritanya.toArray();
        newValues[1]="c";
        for(Object val:newValues);
        System.out.println(val);

        System.out.println("something");
    }
}