package com.example;

public class Demo {

	public static void main(String[] args) {
		int n=5,i,p=3,v=25;
		int a[]= new int[5];
		
				a[0]=10;
				a[1]=20;
				a[2]=30;
				a[3]=40;
		
		for(i=n-1;i>p-1;i--) {
			a[i]=a[i-1];
			
		}
		a[p-1]=v;
		for(i=0;i<n;i++) {
		System.out.print(a[i]+" ");
	    }
	
	}

}
