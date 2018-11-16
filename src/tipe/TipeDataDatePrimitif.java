package tipe;

import java.util.Date;
import java.time.LocalDate;
import java.text.SimpleDateFormat;

public class TipeDataDatePrimitif{
    public static void main(String[] args) throws Exception {
        Date tanggal = new Date ();
        System.out.println("Tanggal sekarang adalah " +tanggal);
        LocalDate tanggalSekarang = LocalDate.now();
        System.out.println(
            "Tanggal sekarang adalah "+
            tanggalSekarang
        );
        LocalDate tanggalKemarin = LocalDate.of(2018, 11, 11);
        System.out.println(
            "Tanggal kemarin adalah "+
            tanggalKemarin
        );
        SimpleDateFormat sdf= new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        System.out.println("Tanggal yang sudah di format : "+sdf.format(tanggal));
    }

}