package com.basicprogram;

import java.math.BigInteger;

public class Prime_No_to_find_3_no {

	public static void main(String[] args) {
		int c=0;
		for (int i =2 ; ; i++) {
			BigInteger b= BigInteger.valueOf(i);
			if (b.isProbablePrime(55)) {
				
				System.out.println(i);
				c++;
			}
			if(c==3)
				break;
			
		}
	}

}
