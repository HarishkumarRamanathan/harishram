package ProLevel;

import java.util.Scanner;

public class Last3DigitRemove {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		int i = 0, j = 0;
		for (i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0; i < a[1]; i++) {
			System.out.println(a[i]);
		}
	}

}
