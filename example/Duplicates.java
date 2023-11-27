package com.example;

public class Duplicates {

	public static void main(String[] args) {
		int a[]= {1,1,2,3,4,2,3};
		int i,j,visited=-1,count=0;
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					
					a[j]=visited;
					count ++;
				}
			}
			
		}
		System.out.println(count);
		for(i=0;i<a.length;i++) {
			if(a[i]!=-1)
			  System.out.print(a[i]+" ");
			
		}

	}

}
