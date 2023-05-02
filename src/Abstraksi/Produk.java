package Abstraksi;

// abstract class Produk
abstract class Produk {
    protected String nama;
    protected int harga;

    // constractor class produk
    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract int hitungHarga(); // method abstract
}