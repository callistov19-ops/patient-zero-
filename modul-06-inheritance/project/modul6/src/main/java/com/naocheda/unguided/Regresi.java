package com.naocheda.unguided;

public class Regresi extends MachineLearning {
    private int jumlahFitur;

    public Regresi(String namaModel, int jumlahDataLatih, int jumlahFitur) {
        super(namaModel, jumlahDataLatih);
        this.jumlahFitur = jumlahFitur;
    }    

    @Override 
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Fitur: " + jumlahFitur);
    }

    @Override 
    public int hitungBiaya(){
        return super.hitungBiaya() + (jumlahFitur * 10);
    }

    public int hitungBiaya(int epoch, int batchSize){
        return (getJumlahDataLatih() * epoch ) / batchSize;
    }
}
