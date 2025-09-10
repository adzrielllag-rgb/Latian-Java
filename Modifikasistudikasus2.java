import java.util.Scanner;

public class Modifikasistudikasus2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     double L,P,sisi_Persegi,jari_Lingkaran,phi = 3.14;
     double luas_Persegi,luas_lingkaran,luas_Tanah_awal,total_Luas_tanah,Luas_kolam;

      System.out.println("Masukan panjang tanah : ");
      P = sc.nextDouble();
      System.out.println("Masukan lebar tanah : ");
      L = sc.nextDouble();
      luas_Tanah_awal = L * P;
      System.out.println("Masukan luas tanah awal :" +luas_Tanah_awal);

      System.out.println("Masukan sisi persegi : ");
      sisi_Persegi = sc.nextDouble();
      luas_Persegi = sisi_Persegi * sisi_Persegi;
      System.out.println("Masukan luas persegi :" +luas_Persegi);

      System.out.println("Masukan jari-jari lingkaran : ");
      jari_Lingkaran = sc.nextDouble();
      luas_lingkaran = phi * jari_Lingkaran * jari_Lingkaran;
      System.out.println("Masukan luas lingkaran :" +luas_lingkaran);

      Luas_kolam = luas_Persegi + luas_lingkaran;
      System.out.println("luas kolam : " +Luas_kolam);

      total_Luas_tanah = luas_Tanah_awal - Luas_kolam;
      System.out.println("luas tanah yang ditanami rumput : " +total_Luas_tanah);
  }
}
