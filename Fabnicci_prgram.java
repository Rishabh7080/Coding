package com.basicprogram;

import java.util.Scanner;

public class Fabnicci_prgram {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int a=0,b=1,c;
		System.out.println("Enter the Limit");
		int n=scanner.nextInt();
		//for (int i = 1; i<=n; i++)
		while(n-->0){
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}

}
