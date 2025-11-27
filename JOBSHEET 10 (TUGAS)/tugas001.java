import java.util.Scanner;

public class tugas001 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in); 
    
    int[][] survei = new int[10][6];  
    String[] namaResponden = new String[10];
    double[] rataResponden = new double[10];
    double[] rataPertanyaan = new double[6];
    double rataKeseluruhan = 0;
    int totalNilai = 0;

  
    System.out.println("===== SURVEI PERTANYAAN =====");
   
    for (int i = 0; i < survei.length; i++) {
      System.out.print("Nama responden ke-" + (i + 1) + ": ");
      namaResponden[i] = sc.nextLine();

      int totalResponden = 0;
      for (int j = 0; j < survei[i].length; j++) {
        System.out.print("Jawaban untuk pertanyaan ke-" + (j + 1) + " : ");
        survei[i][j] = sc.nextInt();
        totalNilai += survei[i][j];
        totalResponden += survei[i][j];
      }
      sc.nextLine();
      
      rataResponden[i] = (double) totalResponden / survei[i].length;
      System.out.println();
    }

    for (int j = 0; j < survei[0].length; j++) {
      int totalPertanyaan = 0;
      for (int i = 0; i < survei.length; i++) {
        totalPertanyaan += survei[i][j];
      }
      rataPertanyaan[j] = (double) totalPertanyaan / survei.length;
    }

    rataKeseluruhan = (double) totalNilai / (survei.length * survei[0].length);

    
    System.out.println("\n===== HASIL SURVEI =====");
    for (int i = 0; i < survei.length; i++) {
      System.out.print("\nRata-rata responden ke-" + (i + 1) + ": " + rataResponden[i]);
    }
    System.out.println();
    for (int j = 0; j < survei[0].length; j++) {
      System.out.print("\nRata-rata pertanyaan ke-"  + (j + 1) + ": " + rataPertanyaan[j] );
    }

    System.out.print("\n\nRata-rata keseluruhan: " + rataKeseluruhan);

    sc.close();
  }
}
