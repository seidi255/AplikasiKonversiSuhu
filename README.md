# AplikasiKonversiSuhu
 Tugas 2-SEIDI RAHMAT(2210010262)

**Tujuan Aplikasi:**

Aplikasi ini dirancang untuk membantu pengguna mengkonversi suhu dari satu satuan ke satuan lainnya. Pengguna dapat memasukkan suhu dalam Celcius, Fahrenheit, Reamur, atau Kelvin, lalu memilih satuan tujuan yang diinginkan.

**Cara Kerja:**

**Antarmuka Pengguna (GUI):**

- Komponen Utama: Aplikasi memiliki komponen-komponen seperti kotak teks untuk memasukkan suhu, daftar dropdown untuk memilih satuan, tombol untuk melakukan konversi, dan label untuk menampilkan hasil.
- Interaksi Pengguna: Pengguna berinteraksi dengan aplikasi dengan cara memasukkan nilai suhu, memilih satuan awal dan tujuan, serta menekan tombol konversi.
  
**Logika Program:**

- Mendengarkan Perubahan Input: Aplikasi terus memantau perubahan pada kotak teks input suhu. Ketika ada perubahan, fungsi konversiOtomatis() akan dipanggil.
- Mengambil Data: Fungsi konversiOtomatis() mengambil nilai suhu yang dimasukkan, satuan awal, dan satuan tujuan dari komponen GUI.
- Melakukan Konversi: Fungsi konversiSuhu() melakukan perhitungan konversi berdasarkan rumus yang sesuai dengan satuan awal dan tujuan.
-Menampilkan Hasil: Hasil konversi ditampilkan pada label hasil.

**Fitur Tambahan:**

- Konversi Otomatis: Aplikasi secara otomatis melakukan konversi setiap kali nilai suhu atau pilihan satuan diubah.
- Validasi Input: Aplikasi hanya menerima input berupa angka.
- Tombol Hapus: Menghapus semua input dan hasil.
- Tombol Keluar: Menutup aplikasi.

**Penjelasan Kode:**

initComponents(): Fungsi ini menginisialisasi semua komponen GUI yang telah dirancang sebelumnya.

konversiOtomatis():
- Membaca nilai suhu dari kotak teks.
- Mendapatkan satuan awal dan tujuan dari daftar dropdown.
- Memanggil fungsi konversiSuhu() untuk melakukan perhitungan.
- Menampilkan hasil dalam format yang sesuai.

konversiSuhu():
- Menerima nilai suhu, satuan awal, dan satuan tujuan sebagai parameter.
- Melakukan perhitungan konversi berdasarkan rumus yang sesuai.
- Mengembalikan nilai hasil konversi.

getSymbol(): Mengembalikan simbol untuk setiap satuan suhu (misalnya, °C untuk Celcius).
Ringkasan:

Aplikasi ini menggunakan konsep pemrograman berorientasi objek (OOP) dalam bahasa Java. Komponen-komponen GUI seperti tombol, kotak teks, dan label dihubungkan dengan event listener untuk merespons aksi pengguna. Logika program mengatur aliran data dan perhitungan, serta menampilkan hasil kepada pengguna.




![Demo GIF](https://github.com/seidi255/AplikasiKonversiSuhu/blob/main/img/demo%20suhu.gif)
