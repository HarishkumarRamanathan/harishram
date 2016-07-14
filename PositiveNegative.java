import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>=1)
{
	System.out.println("Positive");
}else if(n<=-1)
{
	
	System.out.println("Negative");
}
else if(n==0)
{
	System.out.println("Neither positive nor negative");
}
else
{
	System.out.println("Expected");
}
	}

}

