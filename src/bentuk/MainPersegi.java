package bentuk;

public class MainPersegi{

    public static void main(String[] args) {
        
        Persegi kotak = new Persegi();
        kotak.panjangNonStatic = 15;
        Persegi.panjangStatic = 200;

        Persegi kotakKedua = new Persegi(5, 6);
        kotakKedua.panjangNonStatic = 20;
        Persegi.panjangStatic = 25;
        
        kotakKedua.luas();
        System.out.println(kotak.panjangNonStatic+" "+Persegi.panjangStatic);
    }
}