
import java.util.Scanner;

public class SumXY {
	

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int x=s.nextInt();
	int y=s.nextInt();
	int rem=0;
	int sum=0,sum1=0;
	int temp=x;
	while(temp>0)
	{
		rem=temp%10;
		temp/=10;
		sum*=rem;
	}
	sum1+=sum;
if(x==y)
{
	System.out.println("X is a Seed of Y");
}
else
{
	System.out.println("X is not a Seed of Y");
}
	}

}
