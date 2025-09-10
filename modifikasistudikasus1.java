import java.util.Scanner;
public class modifikasistudikasus1 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      long gaji_pokok,jumlah_anak;
      float potongan_persen_gaji, gaji_bersih, tunjangan_anak, potongan_gaji;

      System.out.println("Masukan gaji pokok : ");
      gaji_pokok = sc.nextLong();
      System.out.println("Masukan tunjangan anak : ");
      tunjangan_anak = sc.nextLong();
      System.out.println("Masukan jumlah anak : ");
      jumlah_anak = sc.nextLong();
      System.out.println("Masukan potongan gaji (dalam persen) : ");
      potongan_persen_gaji = sc.nextFloat();

      potongan_gaji = potongan_persen_gaji * gaji_pokok;
      System.out.println("Potongan gaji : " +potongan_gaji);
      gaji_bersih = gaji_pokok + (tunjangan_anak * jumlah_anak) - potongan_gaji;
      System.out.println("Gaji bersih : " +gaji_bersih);
      }
  }
