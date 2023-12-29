import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        Datadiri data = new Datadiri(null, null);
        ArrayList<Invoice> dataInvoice = new ArrayList<>(); 

        ArrayList<Gitar> listGitar = new ArrayList<>();
        listGitar.add(new Gitar("Squier Affinity", 5000000));
        listGitar.add(new Gitar("Ibanez RG 45", 7000000));
        listGitar.add(new Gitar("Shecter Synystergates", 11000000));
        listGitar.add(new Gitar("Yamaha pacifica", 4500000));
        ArrayList<Bass> listBass = new ArrayList<>();
        listBass.add(new Bass("Gibson Thunderbird IV", 4300000));
        listBass.add(new Bass("Gretsch White Falcon Bass", 12000000));
        listBass.add(new Bass("Rickenbacker 4001/4003", 4300000));
        listBass.add(new Bass("Fender Jazz Bass (J-Bass)", 7600000));
        ArrayList<Drum> listDrum = new ArrayList<>();
        listDrum.add(new Drum("Pearl Session Studio Select", 4500000));
        listDrum.add(new Drum("DW Collector's Series", 7000000));
        listDrum.add(new Drum("Ludwig Keystone X", 9000000));
        listDrum.add(new Drum("NUX DM-1 Drum Practice Pad", 6500000));
        
        System.out.println("=====TOKO MELODI=====");
        System.out.print("Masukan nama: ");
        data.nama = q.nextLine();
        System.out.print("Masukan Alamat: ");
        data.Alamat = q.nextLine();
        System.out.println(data.selamat());

        String ambilbarang = "";
        int ambilharga = 0;

        boolean menu = true;
        while (menu) {
            System.out.println("\n=======MENU======");
            System.out.println("1. Pilih alatmusik" + "\n2. Lihat invoice" + "\n3. Keluar");
            System.out.print("Pilih: ");
            int pilihAlatMusik = q.nextInt();

            switch (pilihAlatMusik) {
            case 1:
            System.out.println("\n=====PILIH ALAT MUSIK=====");
            System.out.println("1. Gitar " + " || " + " 2. Bass " + " || " + " 3. Drum " + " || " + " 4. Kembali ");
            System.out.print("Pilih: ");
            int pilihgitar = q.nextInt();
            switch (pilihgitar) {
                case 1:
                    System.out.println("\n=====PILIH GITAR======");
                    for (int i = 0; i < listGitar.size(); i++){
                        System.out.println((i + 1) + ". " + listGitar.get(i).getMerk());
                    }System.out.print("Pilih: ");
                     int pilihGitar = q.nextInt();
                    if (pilihGitar >=1 && pilihGitar <= listGitar.size()) {
                        Gitar gitarpilih = listGitar.get(pilihGitar - 1);
                        ambilbarang = gitarpilih.getMerk();
                        ambilharga = gitarpilih.getHarga();

                        dataInvoice.add(new Invoice(ambilbarang, ambilharga));

                        System.out.println("Harga: " + "Rp. " + gitarpilih.getHarga());
                    }else{
                        System.out.println("-Mohon masukan angka yang benar-");
                    }                  
                    continue;
                case 2:
                    System.out.println("\n======PILIH MERK BASS======");
                    for (int i = 0; i < listBass.size(); i++){
                        System.out.println((i + 1) + ". " + listBass.get(i).getMerk());
                    }System.out.print("Pilih: ");
                     int pilihBass = q.nextInt();
                    if (pilihBass >=1 && pilihBass <= listBass.size()) {
                        Bass basspilih = listBass.get(pilihBass = 1);
                        ambilbarang = basspilih.getMerk();
                        ambilharga = basspilih.getHarga();

                        dataInvoice.add(new Invoice(ambilbarang, ambilharga));

                        System.out.println("Harga: " + "Rp. " + basspilih.getHarga());
                    }else{
                        System.out.println("Mohon masukan angka yang benar");
                    }
                    break;
                case 3:
                    System.out.println("\n======PILIH MERK DRUM======");
                    for (int i = 0; i < listDrum.size(); i++){
                    System.out.println((i + 1) + ". " + listDrum.get(i).getMerk());
                    }System.out.print("Pilih: ");
                     int pilihDrum = q.nextInt();
                     if (pilihDrum >=1 && pilihDrum <= listDrum.size()) {
                        Drum drumpilih = listDrum.get(pilihDrum = 1);
                        ambilbarang = drumpilih.getMerk();
                        ambilharga = drumpilih.getHarga();

                        dataInvoice.add(new Invoice(ambilbarang, ambilharga));

                        System.out.println("Harga: " + "Rp. " + drumpilih.getHarga());
                     }else{
                        System.out.println("Mohon masukan angka yang benar");
                     } 
                    break;
                case 4:
                    continue;

                    default:
                    System.out.println("-Tolong masukan angka yang benar-");
                    break;                    
                }
                    break;
            case 2:
                    System.out.println("\n======INVOICE======");
                    if (dataInvoice.isEmpty()) {
                        System.out.println("Belum ada Riwayat pembelian");
                    }else{
                        int jumlah = 0;
                        System.out.println("Nama       : " + data.getNama());
                        for (Invoice barang: dataInvoice){
                        System.out.println("Alat musik : " + barang.getNamaAlatmusik());
                        System.out.println("Harga      : " + "Rp. " + barang.getHargaAlatmusik());
                        
                        jumlah += barang.getHargaAlatmusik();
                        }
                        System.out.println("\nTotal Harga: " + "Rp. " + jumlah);
                        System.out.println("Barang akan di kirimkan ke alamat, " + data.getAlamat());
                    }
                    continue;
            case 3:                  
                    if (pilihAlatMusik == 3) {
                        System.out.println("Terimakasih sudah berkunjung"); 
                        menu = false;
                    }
                    q.close(); 
                    break;
                    
            default:
                    System.out.println("-Pilihan anda tidak ada-");
                    continue;               
                }      
            }            
        }
    }      