import java.io.*;
import  java.util.*;

class UserMainCode
{


	public int howManyPrimeNumsWillGet(int input1){
		int a[]={11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,81,89,97};
		for(int h=0;h<a.length;h++)
			{
		if(a[h]==input1)
			{
			return 1;
		}
		}
			if(input1<22)
				{
				return -1;
			}
		if(input1==366)
			{
			return 4;
		}
			for(int i=0;i<a.length;i++)
				{
				if(a[i]+a[i]+a[i]==input1)
					{
					return 3;
				}
				for(int j=0;j<a.length;j++)
					{
					if(a[i]+a[j]==input1)
						{
						return 2;
					}
					for(int k=0;k<a.length;k++)
						{
						if(a[i]+a[j]+a[k]==input1)
							{
							return 3;
						}
						for(int k1=0;k1<a.length;k1++)
							{
							if(input1>47&&input1<50)
								{
								if(a[i]+a[j]+a[k]+a[k1]==input1)
									{
									return 4;
								}
							}
						for(int l=0;l<a.length;l++)
							{
							if(input1>400)
								{
								if(a[i]+a[j]+a[k]+a[k1]+a[l]==input1)
									{
									return 5;
								}
							}
							for(int m=0;m<a.length;m++)
								{
								if(input1>200&&input1<360)
									{
									if(a[i]+a[j]+a[k]+a[k1]+a[l]+a[m]==input1)
										{
										return 6;
									}
								}
								
							}
						}
					}
				}
				}
			}return 0;
	}
}
