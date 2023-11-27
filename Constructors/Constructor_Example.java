package com.Constructors;

public class Constructor_Example {
	int n;
	String s;
	Constructor_Example(){
		System.out.println("No args constructor");
	}
	Constructor_Example(int a){
		System.out.println("signal parameterzied constructor value "+a);
	}
	public static void main(String[] args) {
		Constructor_Example c = new Constructor_Example();
		Constructor_Example c1 = new Constructor_Example(10);
		System.out.println("default constructor");
		System.out.println(c.n);
		System.out.println(c.s);

	}

}
