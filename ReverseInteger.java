import java.util.*;
public class Reverse {
public int rev(int num)
{
	int rev=0;
	while(num!=0)
	{
		rev=(rev*10)+(num%10);
		num=num/10;
	}
	return rev;
}
	public static void main(String[] args) {
		
Reverse reverse=new Reverse();
System.out.println("Reverse:"+reverse.rev(5674));
	}

}
