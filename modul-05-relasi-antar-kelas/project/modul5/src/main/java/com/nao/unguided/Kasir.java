package com.nao.unguided;

public class Kasir {
    private String namaKasir;

    //constructor untuk inisiasi nama kasir
    public Kasir(String namaKasir){
        this.namaKasir = namaKasir;
    }

    //method untuk menampilkan struk pesanan
    //objek 'pesanan' mampir bentar buat diitung
    public void prosesPembayaran(Pesanan pesanan){
        //siapin dompet kosong
        double totalSubtotal = 0;
        double totalPajak = 0;

        //ambil arrray list item dari orderan yang dipinjem
        ItemPesanan[] items = pesanan.getDaftarItem();

        //loop untuk itung total semua harga yang di cart
        for (int i = 0; i < pesanan.getJumlahItem(); i++){
            //ambil harga dasar dari item ke-i, tambah ke subtotal
            totalSubtotal += items[i].getRincian().getHargaDasar();
            //ambil pajak dari item ke-i, tambah ke total pajak
            totalPajak += items[i].getRincian().getPajak();
        }

        //itung grand total (subtotal + pajak)
        double totalBayar = totalSubtotal + totalPajak;

        //cetak struk sesuai format
        System.out.println("=== STRUK PEMBAYARAN KASIR ===");
        System.out.println("Kasir Bertugas : " + this.namaKasir);
        System.out.println("Pesanan        : Meja " + pesanan.getNomorMeja());
        System.out.println("Jumlah Item    : " + pesanan.getJumlahItem());
        System.out.println("Total Subtotal : Rp " + totalSubtotal);
        System.out.println("Total Pajak    : Rp " + totalPajak);
        System.out.println("TOTAL BAYAR    : Rp " + totalBayar);
        System.out.println("==============================");
    }
}
