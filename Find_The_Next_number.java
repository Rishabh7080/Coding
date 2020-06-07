package com.basicprogram;

import java.math.BigInteger;
import java.util.Scanner;

public class Find_The_Next_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		BigInteger b= BigInteger.valueOf(n);
		System.out.println(b.nextProbablePrime());
		
		
		
//		BigInteger c= BigInteger.valueOf(10);
//		System.out.println(c.isProbablePrime(555));
	}

	
	}


