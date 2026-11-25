# Unguided Modul 11: HTML, CSS, JavaScript & JSP
Seorang data scientist ingin menampilkan hasil eksperimen tiga model klasifikasi pada sebuah halaman web sederhana. Buatlah halaman tersebut dengan ketentuan berikut. Penamaan class, id, dan variabel dibebaskan, asalkan rapi dan konsisten.

Data yang digunakan:

| Model | Akurasi (%) | Presisi (%) | Recall (%) |
|---|---|---|---|
| Logistic Regression | 82 | 80 | 78 |
| Decision Tree | 85 | 83 | 84 |
| Random Forest | 91 | 90 | 89 |

Buat dua file: `index.html` dan `style.css`.

### Halaman HTML dan Tabel

1. Susun halaman dengan struktur dasar HTML5 yang lengkap, beri judul tab **Hasil Eksperimen Model**, dan pastikan karakter dapat tampil dengan benar.
2. Tampilkan judul halaman dan satu sub-judul "Perbandingan Model Klasifikasi" dengan tingkat heading yang sesuai.
3. Sajikan data di atas dalam bentuk **tabel**. Buat dua tingkat judul kolom: kelompokkan ketiga metrik di bawah satu judul "Metrik Evaluasi (%)", sedangkan kolom "Model" menyatu dengan kedua tingkat judul tersebut.
4. Tuliskan dua kesimpulan singkat dalam bentuk daftar, misalnya model terbaik dan model dengan recall terendah.
5. Tambahkan tautan ke dokumentasi scikit-learn (`https://scikit-learn.org`) yang terbuka di tab baru.

### Form

Di bawah tabel, buat form "Cari Model" yang mengirim data dengan metode POST dan berisi:

1. Isian untuk nama model, dengan teks petunjuk di dalamnya.
2. Pilihan metrik (Akurasi, Presisi, Recall) di mana hanya satu yang boleh dipilih.
3. Pilihan jenis data (Training, Validasi, Testing) dalam bentuk daftar tarik-turun. Atur agar "Testing" terpilih sejak awal.
4. Dua tombol: satu untuk reset dan satu untuk mengirim form.

Semua isian harus memiliki label yang terhubung dengan isiannya.

### CSS

Hubungkan `style.css` ke halaman sebagai file terpisah, lalu terapkan gaya berikut (bebas memilih warna dan ukuran yang rapi):

1. Judul utama rata tengah.
2. Tabel tampil lebih rapi: judul kolom berlatar warna berbeda dan setiap sel memiliki ruang di dalamnya.
3. Baris model terbaik disorot dengan latar hijau muda dan huruf tebal. Gunakan **cara pemilihan yang menyasar satu elemen saja**.
4. Kata "terbaik" pada kesimpulan ditandai dengan latar kuning dan huruf miring, tanpa memecah baris kalimat.
5. Form berada di dalam sebuah kotak berlatar abu-abu muda dengan ruang di dalam dan jarak ke elemen lain.

### JavaScript

Tambahkan skrip pada halaman dengan ketentuan:
1. Simpan akurasi ketiga model dalam sebuah array.
2. Buat sebuah fungsi yang menerima array dan mengembalikan rata-ratanya, dengan memakai perulangan.
3. Tampilkan hasil rata-rata tersebut pada halaman dalam sebuah kalimat, misalnya "Rata-rata akurasi: ...".
4. Simpan data model terbaik (nama dan akurasi) dalam sebuah objek, lalu tampilkan nama modelnya pada halaman.

*Note:* jika belum sempat dipelajari cara memanipulasi elemen halaman, tampilkan hasilnya di Console browser terlebih dahulu.
