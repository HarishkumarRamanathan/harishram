import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		StringBuffer buffer=new StringBuffer(str);
		StringBuffer buffer2=new StringBuffer(buffer);
		
		System.out.println("Reverse a String:"+buffer2.reverse());
		}
		}
