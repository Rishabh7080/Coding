package com.basicprogram;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNo_startingno_to_after_nth_postion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Starting no");
		int sn=sc.nextInt();
		System.out.println("Enter the  n which do you want ");
		int n=sc.nextInt();
		int c=0;
		for (int i =sn; ; i++) {
			BigInteger b=BigInteger.valueOf(i);
			if (b.isProbablePrime(55)) {
				System.out.println(i);
				c++;
				
			}
			if(c==n)
				break;
			
		}

	}

}
