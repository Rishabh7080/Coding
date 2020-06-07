package com.basicprogram;

import java.math.BigInteger;
import java.util.Scanner;

public class Find_3_prime_no {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int n=sc.nextInt();
		int res=0;
		int c=0;
		for (int i = 2; ; i++) {
			BigInteger b=BigInteger.valueOf(i);
			if (b.isProbablePrime(44)) {
				res=i;
				c++;
			}
			if (c==3) 
				break;
		}System.out.println(res);// 3 rd postion prime no 2  3 5 here 3 rd no 5 thatwhy 5  o/p
				
			}
			
		

	
}
