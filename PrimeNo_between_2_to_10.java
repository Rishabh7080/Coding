package com.basicprogram;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNo_between_2_to_10 {

	public static void main(String[] args) {
		
      for (int i = 2; i <= 10; i++) {
    	  BigInteger b= BigInteger.valueOf(i);
    	  if (b.isProbablePrime(74)) {
    		  System.out.println(i);
    		  
			
		}
		
	}
	}

}
