package org.guvi;
import java.util.Scanner;

public class RepeatingString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		char ch[] = str.toCharArray();
		boolean status = false;
		int index = 0;
		System.out.println("Non Repeating String:");
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i == j) {
					continue;
				} else {
					if (ch[i] == ch[j]) {
						status = false;
						break;
					} else {
						status = true;
						index = i;
					}
				}
			}

			if (status) {
				System.out.print(String.valueOf(ch[index]));
			}
		}
	}
}
