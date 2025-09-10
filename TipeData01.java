public class TipeData01 {
  public static void main(String[] args) {
    char golongandarah = 'A';
    byte jarak = (byte) 130;
    short jumlahpendudukdesa = 1025;
    float suhu = 60.0F;
    double berat = 0.5467812345;
    long saldo = 1500000;
    int angkaDesimal = 0x10;
    System.out.println("golongan darah\t\t: " + (byte) golongandarah);
    System.out.println("jarak\t\t\t: " + jarak);
    System.out.println("jumlah penduduk desa\t: "+ jumlahpendudukdesa);
    System.out.println("suhu\t\t\t: " + suhu);
    System.out.println("berat\t\t\t: " + (float) berat);
    System.out.println("saldo\t\t\t: " + saldo);
    System.out.println("angka Desimal\t\t: " + angkaDesimal);
  }
}