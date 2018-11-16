package bentuk;

public class Kelas{
    private Siswa siswa[] = new Siswa[10];
    private String namaKelas;
    private int idKelas;

    public Siswa[] getSiswa() {
        return siswa;
    }

    public void setSiswa(Siswa[] siswa) {
        this.siswa = siswa;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public int getIdKelas() {
        return idKelas;
    }

    public void setIdKelas(int idKelas) {
        this.idKelas = idKelas;
    }
}