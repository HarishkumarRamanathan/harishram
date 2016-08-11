package ProLevel;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element:");
		int N = s.nextInt();
		System.out.println("Element has been entered:");
		int a[] = new int[N];
		int k = 0, j = 0;
		int temp = 0;
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
		for (j = 0; j < N; j++) {
			for (k = 0; k < N; k++) {
				if (a[j] > a[k]) {
					temp = a[j];
					a[j] = a[k];
					a[k] = temp;
				}
			}
		}
		System.out.println("Descending Order:");
		for (j = 0; j < N; j++) {
			System.out.println(a[j] + " ");
		}
		String str = Integer.toBinaryString(a[N - 1]);
		System.out.println("Binary count:" + str);
		int count = Integer.bitCount(a[N - 1]);
		System.out.println("count:"+count);
	}

}
