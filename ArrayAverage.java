package org.guvi;

public class ArrayAvg {
	public static void Array(int[] input) {
	double len = Math.round((double)input.length/2);
		System.out.println("1st Array Size:" + len);
		double len1 =input.length -(int)len;
		 System.out.println("2nd Array Size:" + len1);
		int i = 0, j = 0;
		int sum = 0;
		int sum1 = 0;
		double count=0,count1=0;
		for (i = 0; i < len; i++) {
			sum += input[i];
		}
		count=(sum/len);
		System.out.println(count);
		for (j = (int) (len1+1); j < input.length; j++) {
			sum1+=input[j];
		}
		count1= (sum1/len1);
		System.out.println(count1);
		
		if (count == count1) {
			System.out.println("Possible");
		} else {
			System.out.println("Not possible");
		}

	}

	public static void main(String[] args) {
		int input[] = { 4, 2, 3, 4, 2};
		Array(input);

	}

}
