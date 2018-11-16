package tipe;

public class TipeDataKarakter{
    public static void main(String[] args){
        Character var = 'A';
        System.out.println("Nilai dari variable var adalah "+var);
        String namaSaya = "nama saya";
        System.out.println(
            "Variable dengan nama namaSaya berisi karakter "+namaSaya
        );
        Character hurufKedua = namaSaya.charAt(2);
        System.out.println("Index ketiga dari variable namaSaya adalah "+hurufKedua);
        boolean compare = namaSaya.equalsIgnoreCase("nAmA SayA");
        System.out.println("hasilnya sama ? " + compare);
    }
}