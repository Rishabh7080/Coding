package com.basicprogram;

public class NoOfFactor {

	public static void main(String[] args) {
		int n=10;int c=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0)
			{
			c++;	
			}
	}
		System.out.println(c);
	}
}
