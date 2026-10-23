package com.naocheda.unguided;

public class DeepLearning extends Klasifikasi {
    private int jumlahLayer;

    public DeepLearning(String namaModel, int jumlahDataLatih, int jumlahKelas, int jumlahLayer) {
        super(namaModel, jumlahDataLatih, jumlahKelas);
        this.jumlahLayer = jumlahLayer;
    }    

    @Override 
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Layer: " + jumlahLayer);
    }

    @Override 
    public int hitungBiaya(){
        return super.hitungBiaya() + (jumlahLayer * 200);
    }
}
