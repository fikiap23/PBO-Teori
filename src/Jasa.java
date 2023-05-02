// jasa mewarisi (inheritance) class produk
class Jasa extends Produk {
    private int durasi;

    public Jasa(String nama, int harga, int durasi) {
        super(nama, harga);
        this.durasi = durasi;
    }

    // override class parent(wajib)
    @Override
    public int hitungHarga() {
        return harga * durasi;
    }

    public int getDurasi() {
        return durasi;
    }
}