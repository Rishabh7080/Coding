package com.basicprogram;

import java.util.Scanner;

public class DigitCount {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n=scanner.nextInt();
		int count=0;
		
		while(n>0)
		{
			count++;
			n=n/10;
		}

System.out.println(count);
	}

}
