package com.example;
import java.util.Scanner;


public class Scanner_Concept {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values");
		int n = sc.nextInt();
		double d = sc.nextDouble();
		float f =sc.nextFloat();
		System.out.println("n value is: "+n+" "+"d value is: "+d
				+" "+"f value is: "+f);
		System.out.println("Enter string value");
		String s = sc.next();
		System.out.println("string is "+s);
		

	}

}
