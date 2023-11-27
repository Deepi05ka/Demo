package com.Sample_Package;

public class Singlechildclass extends SingleParentclass {
	 public void bouns(){
  	   System.out.println("bouns 3000");
     }
     
	public static void main(String[] args) {
		Singlechildclass obj=new Singlechildclass();
	   obj.salary();
 	   obj.details();
 	   obj.bouns();
	}

}
