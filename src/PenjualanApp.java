public class PenjualanApp {
    public static void main(String[] args) {
        Produk produk1 = new Barang("Buku", 10000, 3);
        Produk produk2 = new Jasa("Desain Grafis", 50000, 2);

        System.out.println("Nama produk: " + produk1.nama);
        System.out.println("Harga satuan: " + produk1.harga);
        System.out.println("Jumlah: " + ((Barang) produk1).getJumlah());
        System.out.println("Total harga: " + produk1.hitungHarga());
        System.out.println();
        System.out.println("Nama produk: " + produk2.nama);
        System.out.println("Harga satuan: " + produk2.harga);
        System.out.println("Durasi: " + ((Jasa) produk2).getDurasi());
        System.out.println("Total harga: " + produk2.hitungHarga());
    }
}
