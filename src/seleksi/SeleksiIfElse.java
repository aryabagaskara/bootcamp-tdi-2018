package seleksi;

public class SeleksiIfElse{
    public static void main(String[] args) {
        Integer bil1 = 15;
        if (bil1 == 15){
            System.out.println("Bilangan sama");
        }
        else {
            System.out.println("Bilangan beda");
        }

        switch(bil1){
            case 10 : 
            System.out.println("Bilangan bernilai 10");
            break;
            case 15 : 
            System.out.println("Bilangan bernilai 15");
            break;
            default : 
            System.out.println("Nilai tidak ada yang sama");
        }
    }
}