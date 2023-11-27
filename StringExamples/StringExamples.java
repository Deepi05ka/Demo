package com.StringExamples;

public class StringExamples {

	public static void main(String[] args) {
		String name = "Welcome";
		System.out.println(name.concat(name));
		System.out.println(name);
		String s = new String("Hi");
		System.out.println(s);
		StringBuffer s2 = new StringBuffer("Hello");
		System.out.println(s2);
		s2.append("Deepika");
		System.out.println(s2);
		System.out.println(s2.insert(0,"Hi,"));
		System.out.println(s2.delete(0, 1));
		System.out.println(s2.replace(0, 1, "a"));
		System.out.println(s2.reverse());
		System.out.println(s2.capacity());
		System.out.println(s2.length());
		System.out.println(s2.charAt(5));
		System.out.println(s2.substring(0, 5));
		
		System.out.println();
		StringBuffer s3 = new StringBuffer("Hello");
		System.out.println(s3);
		s3.append("Deepika");
		System.out.println(s3);
		System.out.println(s3.insert(0,"Hi,"));
		System.out.println(s3.delete(0, 1));
		System.out.println(s3.replace(0, 1, "a"));
		System.out.println(s3.reverse());
		System.out.println(s3.capacity());
		System.out.println(s3.length());
		System.out.println(s3.charAt(5));
		System.out.println(s3.substring(0, 5));
		

	}

}
