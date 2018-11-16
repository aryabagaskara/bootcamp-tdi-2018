package seleksi;

public class FlowForStatement{
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            if(i%3==0){
                if(i%5==0){
                    System.out.print("fizzbuzz ");
                }
                else {
                    System.out.print("buzz ");
                }
            }
            else if(i%5==0){
                System.out.print("fizz ");
            }
            else{
                System.out.print(i+" ");
            }
        }

        Integer w = 0;
        while (w < 11){
            System.out.println(" while "+w);
            w++;
        }

        Integer dw = 0;
        do {
            System.out.println(" do while "+dw);
            dw++;
        } while (dw < 11);

    }
}