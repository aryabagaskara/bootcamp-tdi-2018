package bentuk;

public class Persegi{

    int panjangNonStatic;
    private int lebar;
    static int panjangStatic;

    public Persegi(){
        System.out.println(" run di konstruktor ");
    }
    public Persegi(int p, int l){
        this.panjangNonStatic = p;
        this.lebar = l;
    }

    public int luas (){
        return panjangNonStatic * lebar;
    }
    
    public int luas(int p, int l){
        return p * l;
    }

}