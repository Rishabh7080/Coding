package com.basicprogram;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNoORNot1 {
	public static void main(String[] args) {
//		int n=20;
//		int c=0;
//		for (int i = 2; i < n/2; i++) {
//			if (n%i==0) {
//				c++;
//				break;
//				
//			}
//			
//		}
//		if(c==0)
//			System.out.println("prime no");
//		else
//			System.out.println("not prime no");
//			
//	}
//
//}
		
		
		
		
		
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Number");
 int n=sc.nextInt();
 BigInteger b= BigInteger.valueOf(n);
 if (b.isProbablePrime(35)) 
	 System.out.println("prime no");
 else 
	 System.out.println("not prime");
	
}
	
}
		
		
		
		
