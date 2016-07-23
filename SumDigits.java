import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=n;
		int rem;
		int sum=0;
		int temp=0;
		while(m>0)
		{
			rem=m%10;
			m=m/10;
			sum=sum+rem;
			temp=sum;
			System.out.println(sum);
		}if(temp==sum)
		{
			System.out.println("Palindrome");
		}else 
		{
		System.out.println("Not a palindrome");
		}
}
}
