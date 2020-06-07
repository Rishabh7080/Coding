package com.basicprogram;

import java.math.BigInteger;
import java.util.Scanner;

public class Find_Given_No_To_End_no_PrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting no");
		int sn=sc.nextInt();
		System.out.println("Enter the End pint");
		int en=sc.nextInt();
		for (int i = sn; i <= en; i++) {
			BigInteger b= BigInteger.valueOf(i);
			if (b.isProbablePrime(56)) {
				System.out.println(i);
				
			}
			
			
		}
		

		
	}

}
