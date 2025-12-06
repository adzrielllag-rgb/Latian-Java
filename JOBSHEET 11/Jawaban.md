======= JAWABAN PERCOBAAN 1 =========

1. Tidak , bisa juga menggunakan return
2. bisa
3. - menggunakan kembali kode
   - mudah diubah
   - mudah dibaca
   - lwbih fleksibel
4. 1. Program dijalankan → main() dieksekusi
   2. Saat menemukan Menu(); → kontrol "melompat" ke fungsi Menu()
   3. Kode di Menu() dijalankan → menu ditampilkan
   4. Fungsi Menu() selesai → kontrol kembali ke main()
   5. Melanjutkan sisa kode di main() hingga program berakhir

======= JAWABAN PERCOBAAN 2 =========

1. untuk membuat varieabel dalam fungsi.Misal(String namaPelanggan, boolean isMember) , sama seperti deklarasi varieabel
2. parameter namaPelanggan untuk mengisi nama pada System.out.println("Selamat datang " + namaPelanggan + "!").
   parameter isMember untuk menentukan benar atau salah pada if(isMember) {}.Karena isMember bertipe boolean (hanya bisa bernilai true atau false)
3. hampir sama bedanya parameter hanya dapat dideklarasikan di dalam fungsi
4. Parameter isMember adalah variabel berjenis boolean yang dideklarasikan dalam fungsi dan boolean hanya bernilai benar atau salah ,maka jika kondisi bernilai benar akan menginputkan System.out.println("Anda adalah member, dapatlan dislon 10% untuk setiap pembelian!"). Jika kondisi bernilai salah maka tidak menginputkan apapun atau proses System.out.println("Anda adalah member, dapatlan dislon 10% untuk setiap pembelian!") dilewati
5. akan terjadi error
6. menu("Budi", true , "DISKON30")
7. Ya, penggunaan parameter namaPelanggan dan isMember pada fungsi menu() sangat membuat program lebih mudah dibaca dan dikembangkan, dibandingkan jika nilai-nilai tersebut ditulis langsung di dalam fungsi.

======= JAWABAN PERCOBAAN 3 =========

1. Kapan perlu Menggunakan Nilai Kembalian ?
   Digunakan saat fungsi bertugas menghitung atau menghasilkan data.
   Kapan Tidak Perlu Menggunakan Nilai Kembalian ?
   Digunakan saat fungsi bertugas melakukan aksi tanpa perlu mengirimkan hasil perhitungan.
2. parameter int pilihmenu berfungsi untuk memilih menu yang ada di dalam array.
   parameter int banyakItems berfungsi untuk menentukan banyaknya menu

======= JAWABAN PERCOBAAN 4 =========

1. untuk menerima nol atau lebih statement (parameter)
2. Aturan di Java hanya memperbolehkan maksimal satu parameter Varargs
   dalam satu metode, dan parameter Varargs tersebut harus diletakkan di posisi terakhir dalam daftar parameter metode.
   contoh = static void menu(String...macam , int banyak)
3. akan terjadi error saat kompilasi

======= JAAWABAN PERCOBAAN 5 =========

1. pertama menjalankan progam fungsi int hitungLuas untuk menyimpan prosesnya yang dialam fungsi tersebut
   kedua menjalankan progam fungsi int hitungVolume untuk menyimpan prosesnya yang dialam fungsi tersebut
   ketiga menginput panjang
   keempat menginput lebar
   kelima menginput tinggi
   keenam memanggil fungsi int hitungLuas
   ketujuh memanggil fungsi int hitungVolume

2. pertama menjalankan progam fungsi int hitungLuas untuk menyimpan prosesnya yang dialam fungsi tersebut
   kedua menjalankan progam fungsi int hitungVolume untuk menyimpan prosesnya yang dialam fungsi tersebut
   ketiga menginput panjang = 3
   keempat menginput lebar = 4
   kelima menginput tinggi = 5
   keenam memanggil fungsi int hitungLuas( p _ l )
   ketujuh memanggil fungsi int hitungVolume ( P _ l \* t )

3. output = 1234567  
   program dimulai dari fungsi main. Pertama, pada baris int temp = Jumlah(1, 1);, fungsi Jumlah dipanggil dengan argumen 1 dan 1, yang segera mengembalikan hasil penjumlahan yaitu 2. Nilai 2 ini kemudian disimpan dalam variabel lokal temp. Selanjutnya, program menjalankan baris kunci TampilJumlah(temp, 5);, memanggil fungsi TampilJumlah dengan parameter 2 dan 5. Di dalam fungsi TampilJumlah, terjadi pemanggilan fungsi yang bersarang (TampilHinggaKei(Jumlah(bil1, bil2))). Fungsi Jumlah dipanggil terlebih dahulu dengan 2 dan 5, yang menghasilkan nilai 7. Nilai 7 ini kemudian diteruskan sebagai argumen ke fungsi TampilHinggaKei. Fungsi TampilHinggaKei(7) kemudian memulai perulangan (for) yang mencetak bilangan bulat j mulai dari 1 hingga 7 secara berurutan tanpa baris baru atau spasi. Setelah perulangan selesai mencetak 1234567, semua fungsi selesai dieksekusi, dan program berakhir dengan output tunggal 1234567.

4. Fungsi harus menggunakan parameter ketika fungsi tersebut memerlukan data eksternal untuk melakukan
   tugasnya atau untuk menyelesaikan perhitungannya.
   Fungsi tidak perlu menggunakan parameter (daftar parameter kosong) ketika fungsi tersebut dapat menyelesaikan tugasnya tanpa memerlukan input data dari pemanggil.

5. Fungsi harus menggunakan parameter ketika memerlukan data eksternal untuk melakukan proses menghitung
   seperti pada percobaan tersebut harus menggunakan parameter karena sebuah fungsi memerlukan proses menghitung

6. Sebuah fungsi di Java sebaiknya memiliki nilai kembalian (return value) ketika tujuan utamanya adalah
   menghasilkan atau menghitung suatu nilai yang harus digunakan, disimpan, atau diproses lebih lanjut oleh bagian program lain.
   fungsi yang tidak perlu memiliki nilai kembalian (menggunakan tipe void) ketika tujuannya adalah melakukan suatu aksi atau operasi yang dampaknya sudah terlihat (seperti mencetak output), dan tidak ada data yang perlu dikirim kembali ke pemanggil.
