class TotalNilai {
    private String nama, nim;
    private Rumus matakuliah;

    public TotalNilai(String nama, String nim, Rumus matakuliah) {
        this.nama = nama;
        this.nim = nim;
        this.matakuliah = matakuliah;
    }

    public void tampilkanHasil() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIM    : " + nim);
        System.out.println("Nilai  Matakuliah Pemrograman Berorientasi Objek:");
        double nilai = matakuliah.hitungNilai();
        System.out.println("Total Nilai: " + nilai);
    }
}