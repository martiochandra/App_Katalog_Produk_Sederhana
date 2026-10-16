# Katalog Produk Sederhana (Tugas 3 Compose)

**Nama:** Martio Chandra
**NIM:** 010252
**Program Studi:** Informatika, Universitas Al Azhar Indonesia

## Tujuan Aplikasi
Aplikasi ini adalah implementasi antarmuka statis (*Static UI*) menggunakan Jetpack Compose dan Material 3. Aplikasi bertujuan menampilkan katalog produk sederhana yang terdiri dari header toko, daftar barang elektronik beserta harga dan rating, serta tombol aksi di bagian bawah, dengan menerapkan prinsip tata letak deklaratif.

## Cara Menjalankan
1. Lakukan *clone* repository ini atau unduh *source code* dalam bentuk ZIP.
2. Buka *project* menggunakan Android Studio.
3. Tunggu proses sinkronisasi Gradle hingga selesai.
4. Pilih perangkat (emulator seperti Pixel 6a atau perangkat fisik Android).
5. Klik tombol **Run 'app'** (segitiga hijau) atau tekan `Shift + F10`.

## Struktur Composable Utama
- **`CatalogScreen`**: Fungsi layar utama yang menggunakan `Column` untuk menyusun seluruh UI secara vertikal.
- **`CatalogHeader`**: Komponen header yang menampilkan judul dan subjudul, dibungkus dalam `Box` dengan styling `background` dan `shadow`.
- **`ProductCard`**: Komponen *reusable* berbentuk `Card` yang memanfaatkan kombinasi `Row` dan `Column` untuk menyusun detail teks nama produk dan harga.
- **`CatalogFooter`**: Area bawah yang berisi `Button` aksi sentral.
