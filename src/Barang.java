// Barang mewarisi (inheritance) class produk
class Barang extends Produk {
    private int jumlah;

    public Barang(String nama, int harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    // override class parent(wajib)
    @Override
    public int hitungHarga() {
        return harga * jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }
}