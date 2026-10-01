package unguided.suhu;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // 1. Data suhu harian mentah[cite: 1]
        double[] suhuHarian = { 30.4, 24.3, 26.8, -1.0, 31.4, 30.8, 32.9 };

        // 2. Inisialisasi object PengolahSuhu[cite: 1]
        PengolahSuhu pengolah = new PengolahSuhu(suhuHarian);

        System.out.println("=== Data Suhu Awal ===");
        pengolah.tampilkanData(); // Tampilkan data awal[cite: 1]
        System.out.println();

        // Cari dan tampilkan index hari kosong[cite: 1]
        int indexKosong = pengolah.cariIndexKosong();
        System.out.println("Index hari kosong (dimulai dari 0): " + indexKosong);
        System.out.println();

        // 3. Jalankan imputasi pengisian data[cite: 1]
        pengolah.isiDataKosong();

        // 4. Tampilkan data akhir yang sudah bersih beserta statistik rata-rata[cite: 1]
        System.out.println("=== Data Suhu Setelah Pengisian ===");
        pengolah.tampilkanData();
        System.out.println();

        System.out.printf("Rata-rata : %.2f°C\n", pengolah.hitungRataRata());
        System.out.println();

        // 5. Cetak array dari variabel main langsung[cite: 1]
        System.out.println("Isi array suhuHarian di main setelah isiDataKosong() dijalankan:");
        System.out.println(Arrays.toString(suhuHarian));
        System.out.println("(ikut berubah: constructor menyimpan referensi array yang sama)");


        /*
         * Penjelasan Perubahan Array pada main:
         * Array di dalam bahasa Java termasuk ke dalam tipe data referensi (reference type)[cite: 1].
         * Ketika array 'suhuHarian' dimasukkan ke dalam constructor 'PengolahSuhu', Java tidak
         * menyalin isi elemen array secara terpisah, melainkan meneruskan referensi (alamat memori)
         * dari array tersebut[cite: 1]. Oleh karena itu, variabel 'suhuHarian' di 'main' dan field
         * 'suhuHarian' di dalam objek 'PengolahSuhu' merujuk pada objek array yang sama di memori[cite: 1].
         * Perubahan nilai yang dilakukan oleh method 'isiDataKosong()' pada objek otomatis membuat
         * array di 'main' ikut berubah[cite: 1].
         */
    }   
}
