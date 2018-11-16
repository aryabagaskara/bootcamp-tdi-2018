package seleksi;

public class BreakAndContinue{
    public static void main(String[] args) {
        for(int i=0;i<15;i++){
            if(i == 3){
                continue;
            }
            else if(i == 5) break;
            System.out.println("ini "+i);
        }
    }
}