package com.naocheda.unguided;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<EksperimenModel> daftarEksperimen = new ArrayList<>();

        daftarEksperimen.add(new EksperimenModel("Logistic Regression", 0.82, 12));
        daftarEksperimen.add(new EksperimenModel("Random Forest", 0.91, 45));
        daftarEksperimen.add(new EksperimenModel("SVM", 0.87, 60));
        daftarEksperimen.add(new EksperimenModel("KNN", 0.79, 5));
        daftarEksperimen.add(new EksperimenModel("Decision Tree", 0.84, 8));

        System.out.println("Jumlah eksperimen: " + EksperimenModel.getJumlahEksperimen());

        Collections.sort(daftarEksperimen);
        System.out.println("\nSorted by akurasi");
        daftarEksperimen.forEach(System.out::println);

        Collections.sort(daftarEksperimen, new WaktuTrainingComparator());
        System.out.println("\nSorted by waktu training");
        daftarEksperimen.forEach(System.out::println);

        System.out.println("\nModel dengan akurasi minimal 0.85");
        List<EksperimenModel> modelTerbaik = daftarEksperimen.stream()
                .filter(m -> m.getAkurasi() >= 0.85)
                .collect(Collectors.toList());
        modelTerbaik.forEach(System.out::println);

        System.out.println("\nPencarian model KNN");
        EksperimenModel hasilCari = daftarEksperimen.stream()
                .filter(m -> m.getNamaModel().equals("KNN"))
                .findFirst()
                .orElse(null);
        System.out.println(hasilCari);
    }
}
