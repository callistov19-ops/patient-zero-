package unguided.suhu;

public class PengolahSuhu {
    // Class field (static final): aturan tetap milik class dan dipakai bersama[cite: 1]
    public static final double NILAI_KOSONG = -1.0;

    // Instance field: menyimpan array suhu 7 hari yang di-enkapsulasi (private)[cite: 1]
    private double[] suhuHarian;

    // Constructor menggunakan nama parameter yang sama dengan field sehingga memakai 'this'[cite: 1]
    public PengolahSuhu(double[] suhuHarian) {
        this.suhuHarian = suhuHarian;
    }

    // Method untuk menampilkan seluruh data suhu apa adanya[cite: 1]
    public void tampilkanData() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                System.out.println("Hari " + (i + 1) + " : (kosong)");
            } else {
                System.out.println("Hari " + (i + 1) + " : " + suhuHarian[i] + "°C");
            }
        }
    }

    // Method untuk mencari index data yang bernilai NILAI_KOSONG[cite: 1]
    public int cariIndexKosong() {
        for (int i = 0; i < suhuHarian.length; i++) {
            if (suhuHarian[i] == NILAI_KOSONG) {
                return i; // Mengembalikan index ditemukannya data kosong[cite: 1]
            }
        }
        return -1; // Mengembalikan -1 jika tidak ada data kosong[cite: 1]
    }

    // Method untuk mengisi data kosong berdasarkan rata-rata tetangganya[cite: 1]
    public void isiDataKosong() {
        int index = cariIndexKosong(); // Memanggil method cariIndexKosong()[cite: 1]
        
        // Memastikan index ditemukan dan berada di antara index awal dan akhir
        if (index != -1 && index > 0 && index < suhuHarian.length - 1) {
            // Rumus imputasi: (suhuHarian[i-1] + suhuHarian[i+1]) / 2[cite: 1]
            this.suhuHarian[index] = (this.suhuHarian[index - 1] + this.suhuHarian[index + 1]) / 2.0;
        }
    }

    // Method untuk menghitung rata-rata dari data yang sudah bersih[cite: 1]
    public double hitungRataRata() {
        double total = 0;
        for (double suhu : suhuHarian) {
            total += suhu;
        }
        return total / suhuHarian.length;
    }
}