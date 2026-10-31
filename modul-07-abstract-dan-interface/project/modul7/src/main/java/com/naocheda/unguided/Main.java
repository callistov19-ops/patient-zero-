package com.naocheda.unguided;

public class Main {
    public static void main(String[] args) {
        //uji proteksi abstraksi
        //tiketBioskop = new TiketBioskop("Film A", 50000, 2); //error

            //buka kasir
            ItemTransaksi.catatLogKasir("Membuka transaksi baru untuk Pelanggan #042.");

            //buat objek transaksi
            TiketReguler tiket1 = new TiketReguler("Interstellar", 40000, 2, 3);
            TiketVIP tiket2 = new TiketVIP("Dune: Part Two", 60000, 2, 25000);
            PaketSnack snack1 = new PaketSnack("Combo Popcorn Caramel + 2 Soda", 1, 55000);

            //array polimorfik heterogen (untuk menyimpan semua item transaksi)
            ItemTransaksi[] keranjang = {tiket1, tiket2, snack1};
            System.out.println("=== DAFTAR TRANSAKSI BIOSKOP ===");

            //pemrosesan dinamis untuk semua item transaksi
            double totalBelanja = 0;
            for (ItemTransaksi item : keranjang) {
                item.cetakRincianItem();
                totalBelanja += item.getNominalBayar();
            }
            System.out.println("-------------------------------------------------------------");
            System.out.println("TOTAL TRANSAKSI : Rp" + totalBelanja);
            System.out.println("=============================================================");

            // 6. Tutup Kasir
            ItemTransaksi.catatLogKasir("Transaksi #042 selesai diproses.");
    }
}
