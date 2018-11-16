package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Practice5No2{

    public static void main(String[] args) {
        Set<Integer> unik = new HashSet<>();
        
        unik.add(1);
        unik.add(3);
        unik.add(5);
        unik.add(10);
        unik.add(1);
        unik.add(20);
        unik.add(10);
        unik.add(1);
        unik.add(20);
        unik.add(9);
        unik.add(1);


        Object[] newValues = unik.toArray();
        
        newValues[3]=10;
        System.out.println("Index ke 0 adalah "+newValues[0].toString()+", index ke 1 adalah "+newValues[1].toString()+", dan index ke 3 adalah "+newValues[3].toString());                    
    }
}   