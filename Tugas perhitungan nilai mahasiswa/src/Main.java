import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama       : ");
        String nama = input.nextLine();
        System.out.print("NIM        : ");
        String nim = input.nextLine();
        System.out.print("Nilai Tubes: ");
        double tubes = input.nextDouble();
        System.out.print("Nilai Quiz : ");
        double quiz = input.nextDouble();
        System.out.print("Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Nilai UTS  : ");
        double uts = input.nextDouble();
        System.out.print("Nilai UAS  : ");
        double uas = input.nextDouble();

        Rumus rumusNilai = new Rumus(tubes, quiz, tugas, uts, uas);
        TotalNilai totalNilaiMahasiswa = new TotalNilai(nama, nim, rumusNilai);

        totalNilaiMahasiswa.tampilkanHasil();
    }
}