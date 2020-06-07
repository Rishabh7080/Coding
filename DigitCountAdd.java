package com.basicprogram;

import java.util.Scanner;
// String Number
public class DigitCountAdd {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		int count=0;
		int sum=0;
		int temp,r,fact ;
		temp=n;
		while(n>0)
		{
			r=n%10;
			fact=1;
			for (int i = r; i >=1; i--) {
				fact=fact*i;
			}
			sum+=fact;
			n=n/10;
		}
		n=temp;
if (n==temp) {
	System.out.println("Strong No");
}
else
	{
		System.out.println("Not Strong No");
	}
}

	}


