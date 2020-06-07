package com.basicprogram;

public class NoOfFactor1 {

	public static void main(String[] args) {
		int n=1000;
		int c=0;
		System.out.println(1);
		for (int i = 2; i <=n/2; i++) {
			if(n%i==0) {
				System.out.println(i);
				
			}
			
		}
		System.out.println(n);

	}

}
