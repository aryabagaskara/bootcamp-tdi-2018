package seleksi;

public class IndexDanPangkat{
    public static void main(String[] args) {
        Double x = 1d;
        for(int i = 0; i < 11; i++){
            for(int j = 0; j < 5; j ++){
                if(i%2==0){
                    System.out.print(i*j+" ");
                    }
                else{
                    x = Math.pow(i, j);
                    System.out.print(x+" ");
                }
            }
            System.out.println();
        }
    }
}