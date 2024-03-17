import java.util.Scanner;

public class DiamondShape {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j;
		int k;
		int p;
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println("");

		}
		for (k = 0; k < n; k++) {

			for (j = n - 1; j >= 0; j--) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
	}
}