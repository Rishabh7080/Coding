package com.basicprogram;

public class HcfGseries {

	public static void main(String[] args) {
		int n=6;
		int m=18;
		int hcf=0;
		for (int i = 1; i <=n; i++) {
			if(n%i==0&&m%i==0)
				hcf=i;
			
		}
        System.out.println("HCF is"+hcf);
		//Lcm product/hcf======product=m*n;
		int product =m*n;
		System.out.println("LCM is"+product/hcf);
	}

}
