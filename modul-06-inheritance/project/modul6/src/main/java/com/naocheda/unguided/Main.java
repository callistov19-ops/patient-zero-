package com.naocheda.unguided;

public class Main {
    public static void main(String[] args) {
        MachineLearning[] models = new MachineLearning[3];
        models[0] = new Regresi("Regresi Linear", 500, 4);
        models[1] = new Klasifikasi("Decision Tree", 800, 3);
        models[2] = new DeepLearning("Neural Network", 1000, 5, 3);

        int totalBiaya = 0;
        for (MachineLearning m : models) {
            m.tampilkanInfo();
            int biaya = m.hitungBiaya();
            System.out.println("Biaya komputasi: " + biaya);
            System.out.println("---");
            totalBiaya += biaya;
        }
        System.out.println("Total Biaya: " + totalBiaya);

        System.out.println("Biaya 10 epoch (Neural Network): " + models[2].hitungBiaya(10));
        System.out.println("Biaya 10 epoch (Regresi Linier): " + models[0].hitungBiaya(10));
        
        Regresi regresi = (Regresi) models[0];
        System.out.println("Biaya 10 epoch batch 50 (Regresi Linier): " + regresi.hitungBiaya(10, 50));
    }
}