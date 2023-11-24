public class MainFormulir {
    public static void main(String[] args) {
        FormulirMahasiswa formulir1 = new FormulirMahasiswa();
        formulir1.cara_bayar();
        formulir1.tatatertibAcara();

        FormulirDosen formulir2 = new FormulirDosen();
        formulir2.cara_bayar();
        formulir2.tataTertibAcara();

        FormulirAdmin formulir3 = new FormulirAdmin();

    }
}
