package com.basicprogram;

public class NoFactorOfTwoNumber {

	public static void main(String[] args) {
		int n=100;
		int m=50;
		for (int i = 1; i <=n; i++) {
			if(n%i==0&&m%i==0)
			{
				 System.out.print(i+" ");
			}
			
		}
		
	}

}
