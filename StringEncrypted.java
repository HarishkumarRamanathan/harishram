import java.util.*;
public class StringEncrypt {
	public static String check(String input){
		String str[]=input.split(" ");
		boolean status=false;
		StringBuffer str1[]=new StringBuffer[str.length];
		int i=0,d=0;
		for(String s:str)
			str1[i++]=new StringBuffer(s);
		for(int j=0;j<str1.length;j++){
			for(int k=str1[j].length()-1;k>=0;k--){
				int c=str1[j].charAt(k);
				status=false;
				if((c>=97&&c<=122)||(c>=65&&c<=90)){
					if(c>=97)
						d=96;
					else
						d=64;
					c-=d;
					status=true;
					for(int l=0;l<k;l++){
						int e=str1[j].charAt(l);
						if(e>=97)
							d=96;
						else
							d=64;
						e-=d;
						e+=c;
						if(e>26)
							e=e-26;
						str1[j].replace(l, l+1, ((char)(e+d))+"");
					}
				}
				if(status==true)
					break;
			}
		}
		String s="";
		for(StringBuffer df:str1)
			s+=df.toString()+" ";
		return s.trim();
	}
	public static void main(String args[]){
		System.out.println(check("abcd. bye baby"));
	}
}
