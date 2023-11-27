package com.Polymorphism;

public class Method_Overloading {
	public void eat() {
		System.out.println("eat biryani");
	}
	public void eat(int a) {
		System.out.println("eat biryani with"+" "+a+" "+"members");
	}
	public void eat(float f) {
		System.out.println("biryani bill(float value)"+" "+f);
	}
	public void eat(String c) {
		System.out.println("eat biryani with"+" "+c);
	}

	public static void main(String[] args) {
		Method_Overloading ob = new Method_Overloading();
		ob.eat();
		ob.eat(2);
		ob.eat(200f);
		ob.eat("egg");
	}

}
