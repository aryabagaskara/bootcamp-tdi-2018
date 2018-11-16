package seleksi;

public class BintangGanjil{
    public static void main(String[] args) {
        Integer i=0;
        while(i<10){
            for(int j=1;j<i;j++){
                if(j<i){
                    System.out.print("* ");;
                }
            }
            System.out.println();
            i=i+2;
        }
    }
}