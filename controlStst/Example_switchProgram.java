package com.controlStst;

import java.util.Scanner;

public class Example_switchProgram {

	public static void main(String[] args) {
		System.out.println("Please select a Language");
		System.out.println("1.Tamil");
		System.out.println("2.English");
		System.out.println("Enter you choice");
		Scanner sc =new Scanner(System.in);
		int choice = sc.nextInt();
		switch(choice){
		case 1:
			System.out.println("You've selected Tamil");
			break;
		case 2:
			System.out.println("You've selected English");
			break;
		default:
			System.out.println("Please select crt language");	
		}
		
		

	}

}
