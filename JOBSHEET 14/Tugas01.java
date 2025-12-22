import java.util.Scanner;

public class Tugas01 {

	static long sumRecursive(long[] arr, int n) {
		if (n <= 0) return 0;
		return arr[n - 1] + sumRecursive(arr, n - 1);
	}

	static long sumIterative(long[] arr) {
		long total = 0;
		for (long v : arr) total += v;
		return total;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
		if (!sc.hasNextInt()) {
			System.out.println("Input tidak valid.");
			sc.close();
			return;
		}
		int n = sc.nextInt();
		if (n <= 0) {
			System.out.println("N harus lebih besar dari 0.");
			sc.close();
			return;
		}

		long[] arr = new long[n];
		for (int i = n; i >= 1; i--) {
			System.out.print("Masukkan angka ke-" + i + ": ");
			while (!sc.hasNextLong()) {
				System.out.print("Input tidak valid. Masukkan angka ke-" + i + ": ");
				sc.next();
			}
			arr[i - 1] = sc.nextLong();
		}
		sc.close();

		long totalIter = sumIterative(arr);
		long totalRek = sumRecursive(arr, n);

		System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalIter);
		System.out.println("(Verifikasi rekursif) Total = " + totalRek);
	}

}
