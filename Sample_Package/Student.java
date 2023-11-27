package com.Sample_Package;

public class Student {
	int rollno;
	String name;
	public void record(int r,String n){
		rollno = r;
		name=n;
	}
	public void display() {
		System.out.println(rollno +" "+ name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student s = new Student();
        s.record(111,"Deepika");
        s.display();
        s.record(122,"priyanka");
        s.display();
        
	}

}
