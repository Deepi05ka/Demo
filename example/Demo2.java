package com.example;

public class Demo2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int i,p=2,n=5;
		for(i=p-1;i<n-1;i++) {
			a[i]=a[i+1];
		}
       for(i=0;i<n-1;i++) {
    	   System.out.print(a[i]+" ");
       }
	
	}
}
