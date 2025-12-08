import java.util.Scanner;

public class RekapPenjualanCafe01 {

    static String[] Menu = { "Kopi", "Teh", "Es Kelmud", "Roti Bakar", "Gorengan"};
    static Scanner sc = new Scanner(System.in);

    static void Penjualan(int[][] penjualan) {

        System.out.println("Masukkan data penjualan untuk setiap menu dan hari.");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("\nMenu: " + Menu[i]);
            for (int d = 0; d < penjualan[i].length; d++) {
                    System.out.print("  Hari " + (d + 1) + " (jumlah terjual): ");
                        int jml = sc.nextInt();
                        sc.nextLine();
                        penjualan[i][d] = jml;    
            }
        }
                sc.nextLine();
        }
    
    static void Tabel(int[][] penjualan) {

        System.out.println();
        System.out.print(String.format("%-12s", "Menu/ Hari"));
        for (int d = 0; d < penjualan[0].length; d++) {
            System.out.print("Day" + (d + 1) + "    ");
        }
        System.out.println("Total");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(String.format("%-12s", Menu[i]));
            int total = 0;
            for (int d = 0; d < penjualan[0].length; d++) {
                System.out.print(String.format("%-8d",  penjualan[i][d]));
                total += penjualan[i][d];
            }
            System.out.println(total);
        }
    }

    static void MenuTertinggi(int[][] penjualan) {

        int penTertinggi = 0;
        int totalTerbaik = 0;
        
        for (int i = 0; i < penjualan.length; i++) {
            int sum = 0;
            for (int d = 0; d < penjualan[i].length; d++)
                sum += penjualan[i][d];
            if (sum > totalTerbaik) {
                totalTerbaik = sum;
                penTertinggi = i;
            }
        }

        System.out.println();
        System.out.println("Menu dengan total penjualan tertinggi selama 7 hari:");
        System.out.println("  " + Menu[penTertinggi] + " Total: " + totalTerbaik);
    }

    static void RataRata(int[][] penjualan) {

        System.out.println();
        System.out.println("Rata-rata penjualan tiap menu selama " + penjualan[0].length + " hari:");
        for (int i = 0; i < penjualan.length; i++) {
            double sum = 0;
            for (int d = 0; d < penjualan[0].length; d++) 
                sum += penjualan[i][d];
            double rata = sum / penjualan[0].length;
            System.out.printf("  %-8s : %.2f\n", Menu[i], rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int menu = Menu.length;
         int hari = 7;

        int[][] penjualan = new int[menu][hari];

        Penjualan(penjualan);

        Tabel(penjualan);

        MenuTertinggi(penjualan);

        RataRata(penjualan);

     sc.close();
    }
}
