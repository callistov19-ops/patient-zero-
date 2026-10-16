package com.nao.unguided;

public class Pesanan {
    //field (atribut) nomorMeja, daftarItem, dan jumlahItem
    private int nomorMeja;
    private ItemPesanan[] daftarItem;
    private int jumlahItem;

    //constructor untuk inisiasi nomorMeja dan daftarItem
    public Pesanan(int nomorMeja, int kapasitas){
        this.nomorMeja = nomorMeja;
        //buat array kosong untuk menampung daftar item pesanan
        this.daftarItem = new ItemPesanan[kapasitas];
        //mulai dari 0 karena belum ada item yang dipesan
        this.jumlahItem = 0;
    }

    //method untuk add item
    //karena parameter item itu objek yang sudah jadi dari class ItemPesanan, maka kita bisa langsung kirim ke sini
    public void tambahItem(ItemPesanan item){
        //taruh objek item di array pada index jumlahItem
        this.daftarItem[this.jumlahItem] = item;
        //tambah 1 biar orderan masuk ke index berikutnya
        this.jumlahItem++;
    }

    //method buat show pesanan
    public void tampilkanPesanan(){
        System.out.println("=== DAFTAR PESANAN CAFE ===");
        System.out.println("Nomor Meja: " + this.nomorMeja);

        //loop sebanyak itemm yang dah masuk
        for (int i = 0; i < this.jumlahItem; i++){
            //ambil objek orderan ke-i dari array daftarItem
            ItemPesanan item = this.daftarItem[i];

            //ambil data berantai dari item > rincian > metode angka
            double hargaDasar = item.getRincian().getHargaDasar();
            double pajak = item.getRincian().getPajak();
            double total = item.getRincian().getHargaTotal(); 

            //format print 
            System.out.println((i + 1) + ". " + item.getNamaItem() + " - Rp " + total + " (Harga: " + hargaDasar + ", Pajak: " + pajak + ")");
        }
        System.out.println();
    }

    //getter dipake kasir buat ambil data pesanan
    public int getNomorMeja(){
        return this.nomorMeja;
    }

    public ItemPesanan[] getDaftarItem(){
        return this.daftarItem;
    }

    public int getJumlahItem(){
        return this.jumlahItem;
    }
}
