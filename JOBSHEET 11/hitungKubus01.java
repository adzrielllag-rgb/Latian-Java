import java.util.Scanner;

public class hitungKubus01 {


    public static int hitungLuasP(int rusuk) {
        return rusuk * rusuk * 6;
    }

    public static int hitungVolume(int rusuk) {
        return rusuk * rusuk * rusuk;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r, L, vol;
      
        System.out.println("Masukkan panjang");
        r = input.nextInt();
      
        L = hitungLuasP(r);
        System.out.println("Luas Persegi Panjang adalah " + L);

      
        vol = hitungVolume(r);
        System.out.println("Volume Balok adalah " + vol);

        input.close();
    }
}
  

