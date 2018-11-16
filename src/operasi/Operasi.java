public class Operasi{
    public static void main(String[] args){
        Integer var=10;
        var++;
        System.out.println("nilai var sekarang adalah " + var);

        var = var + 2;
        System.out.println("nilai var sekarang adalah " + var);

        var--;
        System.out.println("nilai var sekarang adalah " + var);

        boolean check = (var == 10);
        System.out.println("apakah nilainya tidak sama dengan 10 : " + check);
    }
}