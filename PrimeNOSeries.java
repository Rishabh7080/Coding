package com.basicprogram;

public class PrimeNOSeries {

	public static void main(String[] args) {
	int  c=0;
		for (int n = 1; n <=100; n++) {
			for (int j = 2; j <= n/2; j++) {
				if(n%j==0)
					c++;
				
			}
			if(c==0)
				System.out.print(n+"\t");
			else
				c=0;
		
	}

	}

}
