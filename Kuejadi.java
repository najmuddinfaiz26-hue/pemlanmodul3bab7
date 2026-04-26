package Polymorfismeogii;

public class Kuejadi extends Kue {
    private double jumlah;
    
    public Kuejadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah * 2;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jumlah: " + jumlah;
    }
}
