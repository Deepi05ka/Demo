package com.Polymorphism;

public class DataType_Diff {
	public void value() {
		System.out.println("Default value");
	}
	public void value( int n) {
		System.out.println("int"+" "+n);
	}
	public void value(long l) {
		System.out.println("long"+" "+l);
	}
	public void value(float f) {
		System.out.println("flaot"+" "+f);
	}
	public void value(double d) {
		System.out.println("double"+" "+ d);
	}
	public static void main(String[] args) {
		DataType_Diff obj = new DataType_Diff();
		obj.value();
		obj.value(17);
		obj.value(12345l);
		obj.value(23.44);
		obj.value(23.456f);

	}

}
