package com.nao.unguided;

//field (atribut) namaItem dan rincian
public class ItemPesanan {
    private String namaItem;
    private RincianHarga rincian;

    //constructor untuk minta nama menu dan harga dasar saat objek dibuat
    public ItemPesanan(String namaItem, double hargaDasar){
    //enkapsulasi dan parameter this. 
        this.namaItem = namaItem;
    //buat objek di dalam constructor untuk menginisialisasi rincian harga
        this.rincian = new RincianHarga(hargaDasar);
    }

    //method untuk return nama item 
    public String getNamaItem(){
        return this.namaItem;
    }

    //method untuk return objek rincian harga(harga dasar dan pajak)
    public RincianHarga getRincian(){
        return this.rincian;
    }
}