package com.example;
public class Array_Concept {

	public static void main(String[] args) {
		int [] a ={1,2,3,4,5};
		int i;
		int len = a.length;
		System.out.println("Length is "+len);
		for(i=0;i<len;i++) {
			System.out.print(a[i]);
		}
		System.out.println();
		char c[] ={'H','e','l','l','o','w'};
		for(i=0;i<c.length;i++) {
			System.out.print(c[i]);
		}
	}

}
