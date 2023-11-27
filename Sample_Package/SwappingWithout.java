package com.Sample_Package;

public class SwappingWithout {
	public static void main(String[] args) {
	int a=10,b=20;
	System.out.println("Before Swapping"+" "+a+" "+b);
	a=a*b;
	System.out.println(a);
	b=a/b;
	System.out.println(b);
	a=a/b;
	System.out.println(a);
	System.out.println("After Swapping"+" "+a+" "+b);
	
	}
}
