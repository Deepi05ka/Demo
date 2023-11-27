package com.example;
public class TaskEx3 {

	public static void main(String[] args) {
		int n=407,temp,r,sum=0;
		temp=n;
		while(n>0){
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(temp==sum){
			System.out.println(temp+" is Armstrong no" );
		}
		else
			System.out.println(temp +" is not an Armstrong no");

	}

}
