package com.example;
public class TaskEx2 {

	public static void main(String[] args) {
		int n=3,i,count=0;
		if(n>1){
			for(i=1;i<=n;i++) {
				if(n%i==0)
					count++;
			}
				if(count==2){
					System.out.println("prime no");
				}
				else
					System.out.println("Not a Prime no");
			}
		
		else
			System.out.println("Not a Prime no");
	}

}
