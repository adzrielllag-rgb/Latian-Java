========== PERCOBAAN 1 =============

1. Fungsi rekursif adalah sebuah fungsi yang memanggil dirinya sendiri untuk menyelesaikan suatu masalah. Masalah besar dipecah menjadi sub-masalah yang lebih kecil dengan pola yang sama, hingga mencapai kondisi tertentu di mana fungsi tersebut berhenti memanggil dirinya sendiri.
2. tidak sama
   faktorialRekursif(5): Menghasilkan 120.
   faktorialIteratif(5): Menghasilkan 5.

========== PERCOBAAN 2 =============

1. Proses pemanggilan fungsi rekursif hitungpangkat() akan dijalankan sampai nilai pangkat (y) menjadi 0, karena pada kondisi tersebut fungsi tidak lagi memanggil dirinya sendiri.

========== PERCOBAAN 3 =============

1. if(tahun == 0 ) {
   return(saldo);
   }

2. Fase Ekspansi (Pemanggilan Rekursif)

hitungLaba(100000, 3)
= 1.11 \* hitungLaba(100000, 2)

= 1.11 _ (1.11 _ hitungLaba(100000, 1))

= 1.11 _ (1.11 _ (1.11 \* hitungLaba(100000, 0)))

Fase Substitusi (Pengembalian Nilai)

hitungLaba(100000, 0) = 100000
= 1.11 _ (1.11 _ (1.11 _ 100000))
= 1.11³ _ 100000
= 1.367631 \* 100000
= 136763.1
