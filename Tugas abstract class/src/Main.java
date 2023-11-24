public class Main {
    public static void main(String[] args)  {
        Gitar gitar1 = new Gitar();
        gitar1.merk = "Fender";
        gitar1.model = "Stratocoaster";
        gitar1.harga = "Rp. 15.000.000";
        gitar1.senar = "Elixir";
        gitar1.pick = "Dunlop";
        System.out.println("Merk gitar: " + gitar1.merk);
        System.out.println("Model gitar: " + gitar1.model);
        System.out.println("Harga gitar: " + gitar1.harga);
        System.out.println("Merk senar: " + gitar1.senar);
        System.out.println("Merk pick: " + gitar1.pick);
        gitar1.diskon();
        System.out.println();

        Bass bass1 = new Bass();
        bass1.merk = "Squier";
        bass1.model = "Jazz Bass";
        bass1.harga = "Rp. 18.650.000";
        bass1.Gigback = "MOD case";
        System.out.println("Merk Bass: " + bass1.merk);
        System.out.println("Model Bass: " + bass1.model);
        System.out.println("Harga Bass: " + bass1.harga);
        System.out.println("Gickback: " + bass1.Gigback);
        bass1.diskon();
        System.out.println();

        Drum drum1 = new Drum();
        drum1.merk = "Nux DM8";
        drum1.model = "elektrik";
        drum1.harga = "14.539.000";
        drum1.stick = "PHILTER";
        System.out.println("Merk drum: " + drum1.merk);
        System.out.println("Harga drum: " + drum1.harga);
        System.out.println("Merk stik: " + drum1.stick);
        drum1.diskon();
    }
}
