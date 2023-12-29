public abstract class Alat {
    private String merk;
    private int harga;
    public Alat(String merk, int harga) {
        this.merk = merk;
        this.harga = harga;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public int getHarga() {
        return harga;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
}

