package unguided.main;

import unguided.model.Dataset;
import unguided.laporan.LaporanDataset;

public class Main {
    public static void main(String[] args) {
        Dataset data1 = new Dataset();
        data1.setNama("Titanic");
        data1.setJumlahBaris(891);
        data1.setJumlahKolom(12);
        data1.setJumlahMissing(866);

        Dataset data2 = new Dataset("Wine Quality");

        Dataset data3 = new Dataset("Iris", 150, 5, 0);

        Dataset[] daftarDataset = {data1, data2, data3};

        LaporanDataset laporan = new LaporanDataset();
        for (int i = 0; i < daftarDataset.length; i++) {
            laporan.cetak(daftarDataset[i]);
        }

        System.out.println("Total Dataset dibuat: " + Dataset.getTotalDataset());  
    }
}
