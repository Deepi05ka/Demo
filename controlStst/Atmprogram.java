package com.controlStst;

import java.util.Scanner;

public class Atmprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Language");
		Scanner input = new Scanner(System.in);
		String lang = input.next();
		switch(lang){
		case "English":
		System.out.println("you've are selected English");
		break;
		case "Tamil":
		System.out.println("you've are selected Tamil");
		break;
		default:
			System.out.println("Please select correct language");
		}

	}

}
