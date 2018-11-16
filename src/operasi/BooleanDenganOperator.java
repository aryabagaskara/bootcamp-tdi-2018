public class BooleanDenganOperator{
    public static void main(String[] args){
        Integer bilanganBulat = 10;
        Boolean isZero = (bilanganBulat == 10);
        System.out.println(
            "Variable bilangan apakah sama dengan 10 : "
            +(isZero ? "Ya Benar" : "Salah")
        );
    }
}