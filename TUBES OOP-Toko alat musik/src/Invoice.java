public class Invoice {
    private String namaAlatmusik;
    private int hargaAlatmusik;
    public Invoice(String namaAlatmusik, int hargaAlatmusik) {
        this.namaAlatmusik = namaAlatmusik;
        this.hargaAlatmusik = hargaAlatmusik;
    }
    public String getNamaAlatmusik() {
        return namaAlatmusik;
    }
    public void setNamaAlatmusik(String namaAlatmusik) {
        this.namaAlatmusik = namaAlatmusik;
    }
    public int getHargaAlatmusik() {
        return hargaAlatmusik;
    }
    public void setHargaAlatmusik(int hargaAlatmusik) {
        this.hargaAlatmusik = hargaAlatmusik;
    }
}
