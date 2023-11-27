package com.example;
public class TaskEx4 {

	public static void main(String[] args) {
		int n=348,sum=0,r;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
