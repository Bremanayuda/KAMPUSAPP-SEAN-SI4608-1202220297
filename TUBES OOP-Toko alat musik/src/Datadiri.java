public class Datadiri {
    public String nama;
    public String Alamat;
    public Datadiri(String nama, String alamat) {
        this.nama = nama;
        Alamat = alamat;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getAlamat() {
        return Alamat;
    }
    public void setAlamat(String alamat) {
        Alamat = alamat;
    }
    public String selamat(){
        return "Selamat datang " + getNama() + ", Selamat berbelanja";
    }
}
