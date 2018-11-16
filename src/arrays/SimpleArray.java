package arrays;

import java.util.Arrays;

public class SimpleArray{
     public static void main(String[] args) {
         
        String[] nilai = {"sdasd","fdaggfda"};
        String[] nilaiKedua = new String[5];

        nilaiKedua[4]= "hoho";

        System.out.println(Arrays.toString(nilai));

        for(int i = 0; i<nilai.length;i++){
            System.out.println(nilai[i]);
        }

        for(String v : nilaiKedua){
            System.out.println(v);
        }
     }
 }