package com.StringExamples;

public class StringMethod_Programs {

	public static void main(String[] args) {
		String s1 = "Welcome to JAVA class";
		String s2 = "welcome to java class";
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("W"));
		System.out.println(s1.endsWith("s"));
		System.out.println(s1.indexOf("e"));
		System.out.println(s1.lastIndexOf("s"));
		System.out.println(s1.contains("Java"));
		System.out.println(s2.isEmpty());
		System.out.println(s1.substring(0,2));
		System.out.println(s1.concat(s2));
		String a =" apple";
		String b="Apple";
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.trim());
		System.out.println(a.replace("p", "s"));
		System.out.println(a.replaceAll("a","s"));
		String s3[]=s1.split("\\s");
		for(String words:s3 ){
			System.out.println(words);
		}
	    System.out.println(a.charAt(1));
	    char[]ch=a.toCharArray();
	    System.out.println(ch);
	    System.out.println(s1.matches(s2));
	    }
	}
