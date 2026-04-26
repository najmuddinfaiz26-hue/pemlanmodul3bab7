package Polymorfismeogii;

public class Kuepesanan extends Kue {
    private double berat;
   
    public Kuepesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }
 
    public double getBerat() {
        return berat;
    }
 
    @Override
    public double hitungHarga() {
        return getHarga() * berat;
    }
 
    @Override
    public String toString() {
        return super.toString() + ", Berat: " + berat + " kg";
    }
}
 
