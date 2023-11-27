package com.Sample_Package;

public class Demo {
	public void add(){
		System.out.println("This is Addition");
	}
	private void sub(){
		System.out.println("This is Subtraction");
	}
	protected void mul(){
		System.out.println("This is Multiplication");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo obj = new Demo();
		obj.add();
		obj.sub();
		obj.mul();

	}

}
