package com.nao.unguided;

public class RincianHarga {
    //field (atribut) hargaDasar dan pajak
    private double hargaDasar;
    private double pajak;

    //constructor untuk menginisialisasi hargaDasar dan pajak
    public RincianHarga(double hargaDasar){
        this.hargaDasar = hargaDasar;
        this.pajak = this.hargaDasar * 0.10;
    }

    //method untuk menghitung harga total (hargaDasar + pajak)
    public double getHargaTotal(){
        return this.hargaDasar + this.pajak;
    }

    //method getter untuk hargaDasar untuk cetak struk
    public double getHargaDasar(){
        return this.hargaDasar;
    }

    //mengambil nominal pajak untuk cetak struk
    public double getPajak(){
        return this.pajak;
    }
}
