package tipe;

public class TipeDateLong {
    public static void main(String[] args){
        Long nilaiMin = -9_223_372_036_854_775_808;
        Long nilaiMax = 9_223_372_036_854_775_807;
        System.out.println(
            "Nilai minimum dari tipe data java.lang.Long adalah " 
            + nilaiMin + 
            ", Sedangkan nilai maximumnya adalah " 
            + nilaiMax 
        );    
    }
}