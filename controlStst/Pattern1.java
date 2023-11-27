package com.controlStst;

public class Pattern1 {

	public static void main(String[] args) {
		int i,j,n=3;
		for(i=0;i<n;i++){
			for(j=0;j<i+1;j++){
				System.out.print(n-j);
			}
			System.out.println();
		}

	}

}
