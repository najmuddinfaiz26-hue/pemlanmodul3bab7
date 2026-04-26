package Polymorfismeogii;

public class Main {
      public static void main(String[] args) {
 
        Kue[] daftarKue = new Kue[20];
 
        
        daftarKue[0]  = new Kuepesanan("Lumpur",      3000.0,  1.2);
        daftarKue[1]  = new Kuepesanan("Brownies",    9000.0,  1.3);
        daftarKue[2]  = new Kuepesanan("Lukchup",     4000.0,  1.1);
        daftarKue[3]  = new Kuepesanan("Klepon",      1500.0,  1.2);
        daftarKue[4]  = new Kuepesanan("Bika Ambon",  5500.0,  1.3);
        daftarKue[5]  = new Kuepesanan("Serabi",      4000.0,  2.0);
        daftarKue[6]  = new Kuepesanan("Mochi",       3500.0,  1.2);
        daftarKue[7]  = new Kuepesanan("Lapis Legit",600000.0, 3.0);
        daftarKue[8]  = new Kuepesanan("Putu Ayu",    7200.0,  2.3);
        daftarKue[9]  = new Kuepesanan("Cheese Cake", 40000.0, 2.1);

        daftarKue[10] = new Kuejadi("Donat",        2500.0,  10.0);
        daftarKue[11] = new Kuejadi("Bolu Kukus",   2000.0,  8.0);
        daftarKue[12] = new Kuejadi("Nastar",       5000.0,  8.0);
        daftarKue[13] = new Kuejadi("Putri Salju",  5000.0,  5.0);
        daftarKue[14] = new Kuejadi("Kue Sus",      3500.0,  6.0);
        daftarKue[15] = new Kuejadi("Lemper",       2000.0,  12.0);
        daftarKue[16] = new Kuejadi("Onde-onde",    2500.0,  11.0);
        daftarKue[17] = new Kuejadi("Roti Bakar",   5500.0,  4.0);
        daftarKue[18] = new Kuejadi("Pancong",      3000.0,  10.0);
        daftarKue[19] = new Kuejadi("Pisang Molen", 3700.0,  7.0);
 
    
        System.out.println("===== DAFTAR KUE : =====");
 
        System.out.println("KUE PESANAN:");
        for (Kue k : daftarKue) {
            if (k instanceof Kuepesanan) {
                System.out.println(k);
            }
        }
 
        System.out.println("\nKUE JADI:");
        for (Kue k : daftarKue) {
            if (k instanceof Kuejadi) {
                System.out.println(k);
            }
        }
 
        double totalHargaSemua    = 0;
        double totalHargaPesanan  = 0;
        double totalBeratPesanan  = 0;
        double totalHargaJadi     = 0;
        double totalJumlahJadi    = 0;
        Kue    kueTermahal        = daftarKue[0];
 
        for (Kue k : daftarKue) {
            double hargaAkhir = k.hitungHarga();
            totalHargaSemua += hargaAkhir;
 
            if (k instanceof Kuepesanan kp) {
                totalHargaPesanan += hargaAkhir;
                totalBeratPesanan += kp.getBerat();
            } else if (k instanceof Kuejadi kj) {
                totalHargaJadi    += hargaAkhir;
                totalJumlahJadi   += kj.getJumlah();
            }
 
            if (hargaAkhir > kueTermahal.hitungHarga()) {
                kueTermahal = k;
            }
        }
 
        System.out.println("\n===== Informasi Semua Kue =====");
        System.out.println("Total Harga Semua Kue: Rp "   + totalHargaSemua);
        System.out.println("Total Harga Kue Pesanan: Rp " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: "    + totalBeratPesanan + " kg");
        System.out.println("Total Harga Kue Jadi: Rp "    + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: "      + totalJumlahJadi);
        System.out.println("Kue dengan Harga Termahal: "  + kueTermahal);
    }

}
