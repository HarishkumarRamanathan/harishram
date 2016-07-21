import java.util.Scanner;

public class PrimeNum {

	private static String primeNumber;

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count = 0;
		for (int i = 2; i <=n/2; i++) {
			
			if (n % i == 0) {
					System.out.println("Not a prime");
					count++;
					break;
				}
			}
				if (count== 0) {
				 
				System.out.println("PrimeNumber");
				
			}
		}

	}

