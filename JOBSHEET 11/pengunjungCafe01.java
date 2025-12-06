public class pengunjungCafe01 {

  static void daftarpengunjung (String...namaPengunjung) { 

    System.out.println("Daftar nama  pengunjung : ");
    for (int i = 0 ; i < namaPengunjung.length ; i++ ) {
      System.out.println("- " + namaPengunjung[i]);
    }

  }

  public static void main(String[] args) {

  
    daftarpengunjung("Ali","Budi","Citra") ;
    daftarpengunjung("Andi");
    daftarpengunjung("Doni","Eti","Fahmi","Galih");
  }
  
}
