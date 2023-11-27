package com.ExceptionHandlingConcepts;

public class ExceptionhandlingProgram {

	public static void main(String[] args) {
		int a=20;
		int b=0;
		try {
			int d[]={};
			System.out.println(d[2]);
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutofBounds Exception");
		}
		finally {
			int e =a+b;
			System.out.println(e);
			int e1=a*b;
			System.out.println(e1);
		}

	}

}
