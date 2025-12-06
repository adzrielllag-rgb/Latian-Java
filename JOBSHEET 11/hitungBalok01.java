import java.util.Scanner;

public class hitungBalok01 {


    public static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    public static int hitungVolume(int tinggi, int panjang, int lebar) {
        return tinggi * panjang * lebar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol; 

      
        System.out.println("Masukkan panjang");
        p = input.nextInt();

        
        System.out.println("Masukkan lebar");
        l = input.nextInt();

        
        System.out.println("Masukkan tinggi");
        t = input.nextInt();

      
        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

      
        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);

        input.close();
    }
}