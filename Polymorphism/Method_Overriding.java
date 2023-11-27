package com.Polymorphism;

public class Method_Overriding extends Method_Overloading {
	@Override
	public void eat(String c) {
		c = c +" "+ "raita and tandoori";
		System.out.println("eat biryani with"+" "+c);
	}
	public void Drink(int a){
		System.out.println("Drink a juice with"+" "+a+" "+"friends");
	}
	@Override
	public void eat() {
		System.out.println("eats");
	}
	public static void main(String[] args) {
		Method_Overriding e = new Method_Overriding();
		e.eat("egg");
		e.Drink(2);
		e.eat();
	}
}

