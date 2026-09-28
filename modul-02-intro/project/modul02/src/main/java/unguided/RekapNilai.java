package unguided;

public class RekapNilai {
    public static void main(String[] args) {
        // Deklarasi konstanta KKM dengan keyword final
        final double KKM = 75.0;

        // Array 1D untuk menyimpan nama-nama mahasiswa (Tipe Data: String)
        String[] namaMahasiswa = {"Andi", "Budi", "Citra"};

        // Array 2D Rectangular untuk menyimpan nilai Modul 1 dan Modul 2 (Tipe Data:double)
        double[][] nilaiModul = {
            {80.0, 85.0}, // Nilai Andi (Modul 1, Modul 2)
            {70.0, 65.0}, // Nilai Budi (Modul 1, Modul 2)
            {90.0, 90.0}  // Nilai Citra (Modul 1, Modul 2)
        };

        // Menampilkan Judul dan KKM
        System.out.println("REKAP NILAI PRAKTIKUM");
        System.out.println();
        System.out.println("KKM: " + KKM);
        System.out.println();

        // Perulangan for untuk mengakses array dan memproses data mahasiswa
        for (int i = 0; i < namaMahasiswa.length; i++) {
            System.out.println("Mahasiswa " + (i + 1) + ": " + namaMahasiswa[i]);
            System.out.println("Nilai Modul 1: " + nilaiModul[i][0]);
            System.out.println("Nilai Modul 2: " + nilaiModul[i][1]);

            // Menghitung rata-rata nilai modul
            double rataRata = (nilaiModul[i][0] + nilaiModul[i][1]) / 2.0;
            System.out.println("Rata-rata: " + rataRata);

            // Percabangan if-else untuk mengevaluasi status kelulusan
            String status;
            if (rataRata >= KKM) {
                status = "LULUS";
            } else {
                status = "REMEDIAL";
            }
            System.out.println("Status: " + status);
            System.out.println();
        }
    }
}
