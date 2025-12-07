import java.util.Scanner;

public class NilaiMahasiswa01 {

    static void awal(int[] nilai) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai matkul ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }
    }

    static void tengah(int[] nilai) {
        System.out.println("\nDaftar nilai mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(" Nilai Matkul ke-" + (i + 1) + ": " + nilai[i]);
        }
    }

    static int total(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah mahasiswa : ");
        int n = sc.nextInt();

        sc.nextLine(); 

        int[] daftarNilai = new int[n];

        System.out.println("\n=== Input Nilai Mahasiswa ===");
        awal(daftarNilai);

        tengah(daftarNilai);

        int totalNilai = total(daftarNilai);
        System.out.println("\nTotal nilai seluruh mahasiswa: " + totalNilai);

        sc.close();
    }
}
