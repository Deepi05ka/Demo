package com.example;
public class variables_Example {
         int a = 10; //instance variable
        public void display(){
        	 int b = 20; //Local Variable
        	 System.out.println("Local variable"+" "+b);
         }
       static int c =30; //Static Variable
         
	public static void main(String[] args) {
		variables_Example ob = new variables_Example();
		System.out.println("instance var"+" "+ob.a);
	    ob.display();
	    System.out.println("Static variable"+" "+c);
        
	}

}
