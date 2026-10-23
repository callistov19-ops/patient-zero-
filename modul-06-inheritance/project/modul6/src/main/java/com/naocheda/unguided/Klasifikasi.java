package com.naocheda.unguided;

public class Klasifikasi extends MachineLearning {
    private int jumlahKelas;

    public Klasifikasi(String namaModel, int jumlahDataLatih, int jumlahKelas) {
        super(namaModel, jumlahDataLatih);
        this.jumlahKelas = jumlahKelas;
    }    

    @Override 
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kelas: " + jumlahKelas);
    }

    @Override 
    public int hitungBiaya(){
        return super.hitungBiaya() * jumlahKelas;
    }
}