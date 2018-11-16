package bentuk;

public class Siswa {
    private int jumlahMataPelajaran;
    private MataPelajaran mapel[] = new MataPelajaran[10];
    private String namaSiswa;
    private int idSiswa;
    

    public MataPelajaran[] getMapel() {
        return mapel;
    }

    public void setMapel(MataPelajaran[] mapel) {
        this.mapel = mapel;
    }

    public int getJumlahMataPelajaran() {
        return this.jumlahMataPelajaran;
    }

    public void setJumlahMataPelajaran(int jumlahMataPelajaran) {
        this.jumlahMataPelajaran = jumlahMataPelajaran;
    }

    public int getIdSiswa() {
        return this.idSiswa;
    }

    public void setIdSiswa(int idSiswa) {
        this.idSiswa = idSiswa;
    }

    public String getNamaSiswa() {
        return this.namaSiswa;
    }

    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }

}