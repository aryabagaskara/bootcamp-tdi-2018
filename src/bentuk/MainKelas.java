package bentuk;

import java.util.Scanner;

public class MainKelas{
    public static void main(String[] args) {
        Siswa siswaArray[] = new Siswa[2];
        double totalNilaiKelas = 0d;
        Scanner inputNama = null;
        Scanner inputMataPelajaran = null;
        Scanner jumlahMataPelajaran = null;
        Scanner nilai = null;
        for(int i = 0; i < siswaArray.length; i++){
            Siswa studento = new Siswa();
            studento.setIdSiswa(i);
            inputNama = new Scanner(System.in);
            jumlahMataPelajaran = new Scanner(System.in);
            System.out.println("nama : ");
            studento.setNamaSiswa(inputNama.next());
            System.out.println("jumlah mapel : ");
            studento.setJumlahMataPelajaran(jumlahMataPelajaran.nextInt());
            MataPelajaran mapelSiswaIni[] = new MataPelajaran[studento.getJumlahMataPelajaran()];
            for (int j = 0; j < mapelSiswaIni.length; j++){
                MataPelajaran mapel = new MataPelajaran();
                System.out.println("nama mata pelajaran : ");
                inputMataPelajaran = new Scanner(System.in);              
                nilai = new Scanner(System.in);
                mapel.setNamaMataPelajaran(inputMataPelajaran.next());
                System.out.println("nilai mata pelajaran : ");  
                mapel.setnilai(nilai.nextInt());
                mapelSiswaIni[j] = mapel;
            }            
            studento.setMapel(mapelSiswaIni);
            siswaArray[i] = studento;
        }

        Kelas kelas = new Kelas();
        kelas.setSiswa(siswaArray);
        kelas.setIdKelas(100);
        kelas.setNamaKelas(" Kelas Satu ");
        System.out.println();
        System.out.println("====================================================");
        System.out.println(" nama kelas : "+kelas.getNamaKelas());
        System.out.println("====================================================");
        Siswa siswaArrayHasil[] = kelas.getSiswa();
        for(int i = 0; i < siswaArrayHasil.length; i++){
            System.out.println(" nama siswa di kelas satu = "+siswaArrayHasil[i].getNamaSiswa());
            MataPelajaran mapelArrayHasil[] = siswaArrayHasil[i].getMapel();
            double totalnilai = 0d;
            for(int j = 0;j < mapelArrayHasil.length;j++){
                int indeks = j+1;
                totalnilai = totalnilai + mapelArrayHasil[j].getnilai();
                System.out.println(" Mata pelajaran ke "+indeks+" adalah "+mapelArrayHasil[j].getNamaMataPelajaran()+" nilainya adalah "+mapelArrayHasil[j].getnilai());
            }
            totalNilaiKelas = totalNilaiKelas + (totalnilai/mapelArrayHasil.length);
            System.out.println("Rata-rata adalah : "+(totalnilai/mapelArrayHasil.length));
            System.out.println("====================================================");
        }
        System.out.println(totalNilaiKelas/siswaArrayHasil.length);
    }           
}