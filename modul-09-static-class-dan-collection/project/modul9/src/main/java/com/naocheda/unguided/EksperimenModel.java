package com.naocheda.unguided;

public class EksperimenModel implements Comparable<EksperimenModel> {
    private String namaModel;
    private double akurasi;
    private int waktuTraining;

    private static int jumlahEksperimen = 0;

    public EksperimenModel(String namaModel, double akurasi, int waktuTraining) {
        this.namaModel = namaModel;
        this.akurasi = akurasi;
        this.waktuTraining = waktuTraining;
        jumlahEksperimen++;
    }

    public String getNamaModel() {
        return this.namaModel;
    }

    public double getAkurasi() {
        return this.akurasi;
    }

    public int getWaktuTraining() {
        return this.waktuTraining;
    }

    public static int getJumlahEksperimen() {
        return jumlahEksperimen;
    }

    @Override
    public int compareTo(EksperimenModel other) {
        return Double.compare(other.akurasi, this.akurasi);
    }

    @Override
    public String toString() {
        return "Model=" + this.namaModel + ", akurasi=" + this.akurasi + ", waktu=" + this.waktuTraining + " detik";
    }
}
