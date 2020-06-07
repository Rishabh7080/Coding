package com.basicprogram;

import java.math.BigInteger;
// factorial program/ biginterger factoral no
public class Add1toNno {
	public static void main(String[] args) {
      int n=50;
//		 int fact=1;
//		 
//		 for (int i = 1; i <=n; i++) {
//			 fact=fact*i;
//			
		
		BigInteger fact=BigInteger.valueOf(1);
		for (int i = 1; i <=n; i++) {
		
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		 System.out.println(fact+" \t");
	}
	

}
