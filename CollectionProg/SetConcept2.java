package com.CollectionProg;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcept2 {
	public void studentHashset(){
	       Set student = new HashSet();
	       Set student2 = new HashSet();
	       
	       student.add(2);
	       student.add(3);
	       student.add("Deepika");
	       System.out.println(student);
	       student2.add(1);
	       student2.add("Moni");
	       System.out.println(student2);
	       System.out.println(student.addAll(student2));
	       System.out.println(student);
	       System.out.println(student.size());
	       System.out.println(student.contains(1));
	       
	       System.out.println(student.remove(1));
	       System.out.println(student);
	       //System.out.println(student.removeAll(student2));
	       //student.clear();
	       //System.out.println(student.getClass());
	       }
//		
//		public void studentLinkedHashSet(){
//		       LinkedHashSet student = new LinkedHashSet();
//		       LinkedHashSet student2 = new LinkedHashSet();
//		       student.add(1);
//		       student.add("Deepika");
//		       student2.add(2);
//		       student2.add("Moni");
//		       System.out.println(student);
//		       System.out.println(student2);
//		       System.out.println(student.size());
//		       System.out.println(student.contains(1));
//		       System.out.println(student.addAll(student2));
//		       //System.out.println(student.size());
//		       System.out.println(student.remove(1));
//		       System.out.println(student);
//		       //System.out.println(student.removeAll(student2));
//		      // System.out.println(student.getClass());
//		       }
//		public void TreeSet(){
//		       Set <Integer> student = new <Integer> TreeSet();
//		       student.add(1);
//		       student.add(5);
//		       student.add(4);
//		    Set <String> student2 = new <String> TreeSet();
//		       student2.add("Deepika");
//		       student2.add("Karthika");
//		       student2.add("Moni");
//		       System.out.println(student);
//		       System.out.println(student2);
//		       System.out.println(student.size());
//		       System.out.println(student.contains(1));
//		       System.out.println(student.size());
//		       System.out.println(student.remove(4));
//		       System.out.println(student);
//		       }

	public static void main(String[] args) {
		SetConcept2 a = new SetConcept2();
		a.studentHashset();
		//a.studentHashset();
		//a.TreeSet();

	}

}
