# Modul Praktikum PBO — Unguided Modul 10: Exception

**Tema Studi Kasus:** Sistem Kasir Toko Sederhana  
**Tujuan Evaluasi:** Mengukur kemampuan praktikan dalam membedakan *unchecked* dan *checked exception*, menerapkan blok `try-catch-finally`, serta menggunakan kata kunci `throw` dan `throws` menggunakan sintaks dasar Java.

---

## Aturan Pengerjaan & Struktur Direktori

1. Seluruh kode program dikerjakan menggunakan **sintaks dasar Java** (tanpa perulangan kompleks, tanpa *try-with-resources*, tanpa *multi-catch* tanda `|`, dan tanpa membuat kelas *custom exception* baru).
2. Pisahkan setiap soal ke dalam *package* dan nama file yang telah ditentukan di dalam folder `src/unguided/` berikut:

```text
src/
└── unguided/
    ├── ug1/
    │   └── PilihBarang.java
    ├── ug2/
    │   └── ValidasiJumlah.java
    └── ug3/
        └── PatunganBayar.java
```

3. Pastikan seluruh file bebas dari *compile error* sebelum dikumpulkan.

---

## Unguided 1 (`unguided.ug1`) — Menangani Multiple Unchecked Exception

* **Target Pemahaman (Materi 10.1, 10.2, & 10.4):** Memahami bahwa kesalahan input pengguna dan kesalahan batas indeks array merupakan turunan `RuntimeException` (*Unchecked Exception*) yang harus ditangani dengan blok `catch` yang spesifik agar program tidak berhenti mendadak (*crash*).

### Spesifikasi Program (`src/unguided/ug1/PilihBarang.java`)
1. Di dalam *method* `main`, buatlah sebuah array 1 dimensi bertipe `String` bernama `daftarBarang` yang berisi 3 nama barang: `{"Buku", "Pulpen", "Penghapus"}`.
2. Tampilkan daftar indeks barang (`0` sampai `2`) ke layar, lalu minta pengguna memasukkan nomor indeks barang menggunakan `Scanner` (`nextInt()`).
3. Bungkus proses pembacaan input dan penampilan nama barang `daftarBarang[indeks]` di dalam satu blok `try`.
4. Buatlah **dua blok `catch` terpisah** untuk menangani kemungkinan kesalahan berikut:
   * `InputMismatchException`: Cetak pesan `"Error: Input harus berupa angka bulat."`
   * `ArrayIndexOutOfBoundsException`: Cetak pesan `"Error: Nomor barang tidak tersedia (pilih 0-2)."`
5. Di luar blok `try-catch`, cetak kalimat penutup: `"Proses pemilihan barang selesai."`

### Skenario Uji Mandiri (Expected Output)
* **Skenario 1 (Input Valid):**
  ```text
  Daftar Barang: [0] Buku, [1] Pulpen, [2] Penghapus
  Masukkan nomor barang (0-2): 1
  Barang terpilih: Pulpen
  Proses pemilihan barang selesai.
  ```
* **Skenario 2 (Input di Luar Batas Array):**
  ```text
  Daftar Barang: [0] Buku, [1] Pulpen, [2] Penghapus
  Masukkan nomor barang (0-2): 5
  Error: Nomor barang tidak tersedia (pilih 0-2).
  Proses pemilihan barang selesai.
  ```
* **Skenario 3 (Input Bukan Angka):**
  ```text
  Daftar Barang: [0] Buku, [1] Pulpen, [2] Penghapus
  Masukkan nomor barang (0-2): buku
  Error: Input harus berupa angka bulat.
  Proses pemilihan barang selesai.
  ```

### Pertanyaan Pemahaman (Sertakan di Laporan)
1. Mengapa program pada `PilihBarang.java` tetap bisa di-*compile* meskipun tanpa blok `try-catch`, namun berhenti secara paksa saat dijalankan jika terjadi salah satu kesalahan di atas?

---

## Unguided 2 (`unguided.ug2`) — Checked Exception dengan `throw` dan `throws`

* **Target Pemahaman (Materi 10.3 & 10.5):** Memahami kontrak pelemparan eksepsi antar-*method* menggunakan kata kunci `throws` dan `throw`, serta kewajiban menangani *Checked Exception* di sisi pemanggil.

### Spesifikasi Program (`src/unguided/ug2/ValidasiJumlah.java`)
1. Buatlah sebuah *method* `static` dengan tanda tangan (*signature*) berikut:
   ```java
   public static void cekJumlah(int qty) throws Exception
   ```
2. Di dalam *method* `cekJumlah`, periksa apakah `qty <= 0`. Jika bernilai benar, lemparkan eksepsi secara manual menggunakan kata kunci `throw`:
   ```java
   throw new Exception("Jumlah barang minimal harus 1.");
   ```
   Jika `qty > 0`, cetak: `"Jumlah barang valid: " + qty + " pcs."`
3. Di dalam *method* `main`, minta pengguna memasukkan jumlah barang yang dibeli menggunakan `Scanner` (`nextInt()`).
4. Panggil `cekJumlah(qty)` di dalam blok `try`, lalu tangkap eksepsinya pada blok `catch (Exception e)` dengan menampilkan: `"Validasi gagal: " + e.getMessage()`. *(Tambahkan juga `catch (InputMismatchException e)` jika pengguna memasukkan huruf).*

### Skenario Uji Mandiri (Expected Output)
* **Skenario 1 (Jumlah Valid):**
  ```text
  Masukkan jumlah barang yang dibeli: 3
  Jumlah barang valid: 3 pcs.
  ```
* **Skenario 2 (Jumlah Nol atau Negatif):**
  ```text
  Masukkan jumlah barang yang dibeli: 0
  Validasi gagal: Jumlah barang minimal harus 1.
  ```

### Pertanyaan Pemahaman (Sertakan di Laporan)
1. Apa yang terjadi pada proses kompilasi jika pemanggilan `cekJumlah(qty)` di dalam `main` ditulis **tanpa** blok `try-catch`? Jelaskan hubungannya dengan deklarasi `throws Exception`!

---

## Unguided 3 (`unguided.ug3`) — Integrasi Alur `try-catch-finally`

* **Target Pemahaman (Materi 10.4 & 10.6):** Membuktikan bahwa blok `finally` selalu dieksekusi oleh Java dalam kondisi apa pun—baik saat perhitungan berhasil maupun saat terjadi eksepsi.

### Spesifikasi Program (`src/unguided/ug3/PatunganBayar.java`)
1. Di dalam *method* `main`, minta pengguna memasukkan dua bilangan bulat menggunakan `Scanner`: `totalBayar` dan `jumlahOrang`.
2. Di dalam blok `try`, hitung biaya per orang dengan operasi pembagian bulat: `int perOrang = totalBayar / jumlahOrang;`, lalu tampilkan hasilnya: `"Biaya per orang: Rp " + perOrang`.
3. Buatlah blok `catch` untuk menangani:
   * `ArithmeticException`: Cetak pesan `"Error: Jumlah orang tidak boleh nol."`
   * `InputMismatchException`: Cetak pesan `"Error: Masukkan nominal dan jumlah orang dalam angka."`
4. Tambahkan blok `finally` setelah seluruh blok `catch` yang mencetak pesan: `"Transaksi kasir selesai."`

### Skenario Uji Mandiri (Expected Output)
* **Skenario 1 (Perhitungan Normal):**
  ```text
  Masukkan total bayar: 60000
  Masukkan jumlah orang: 3
  Biaya per orang: Rp 20000
  Transaksi kasir selesai.
  ```
* **Skenario 2 (Pembagian dengan Nol):**
  ```text
  Masukkan total bayar: 60000
  Masukkan jumlah orang: 0
  Error: Jumlah orang tidak boleh nol.
  Transaksi kasir selesai.
  ```

### Pertanyaan Pemahaman (Sertakan di Laporan)
1. Bandingkan Skenario 1 dan Skenario 2 di atas. Mengapa kalimat `"Transaksi kasir selesai."` tetap muncul pada kedua skenario tersebut?