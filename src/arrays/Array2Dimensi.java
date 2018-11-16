package arrays;

public class Array2Dimensi{

    public static void main(String[] args) {
        
        String[][] duaDunia = {
            {"baris 1 kolom 1","baris 1 kolom 2","baris 1 kolom 3"},
            {"baris 1 kolom 1","baris 1 kolom 2","baris 1 kolom 3"},
            {"baris 1 kolom 1","baris 1 kolom 2","baris 1 kolom 3"}
        };

        for(int i=0;i<duaDunia.length; i++){
            for(int j=0; j<duaDunia[i].length;j++){
                System.out.println(
                    String.format("|\t%s\t|", duaDunia[i][j])
                );
            }
            System.out.println();
        }
    }
}