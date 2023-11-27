package com.example;
public class Keywords_Example {
	public static void method(){
		System.out.println("Static block is executed");
	}
	
	final void meets(){ //final method
		System.out.println("This is final method");
	}

	public static void main(String[] args) {
		Keywords_Example obj = new Keywords_Example();
		method();
		final int i =20; // final variable
		System.out.println(i);
		obj.meets();

	}

}
