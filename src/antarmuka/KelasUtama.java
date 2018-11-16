package antarmuka;

public class KelasUtama {
    public static void main(String[] args) {
        Roda2 motor = new Honda();
        System.out.println(String.format("Jumlah roda : %s", motor.jumlahRoda()));

        CustomMethod<Roda2> kastom = new CustomMethod<>();
        kastom.setHandler(motor);
        System.out.println(kastom.getHandler().jumlahRoda());

        Pesawat garuda = new Max8();

        CustomMethod<Pesawat> MH355 = new CustomMethod<>();
        MH355.setHandler(garuda);
        System.out.println(String.format("PESAWAT ANDA SAAT INI ADALAH %s TIPE 737 Max 8 dengan jumlah mesin %s",
                MH355.getHandler().brand(), MH355.getHandler().jumlahMesin()));
    }
}