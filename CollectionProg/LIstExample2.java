package com.CollectionProg;

import java.awt.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LIstExample2 {
	public void studentArrayList(){
       ArrayList student = new ArrayList();
       //ArrayList student2 = new ArrayList();
       student.add(2);
       student.add("Deepika");
       System.out.println(student);
//       student2.add(1);
//       student2.add("Moni");
//       System.out.println(student2);
//       System.out.println(student.addAll(student2));
       System.out.println(student);
       System.out.println(student.size());
       System.out.println(student.contains(1));
       
       System.out.println(student.remove(1));
       System.out.println(student);
       //System.out.println(student.removeAll(student2));
       //student.clear();
       System.out.println(student.get(0));
       }
	
//	public void studentLinkedList(){
//	       LinkedList student = new LinkedList();
//	       LinkedList student2 = new LinkedList();
//	       student.add(1);
//	       student.add("Deepika");
//	       student2.add(2);
//	       student2.add("Moni");
//	       System.out.println(student);
//	       System.out.println(student2);
//	       System.out.println(student.size());
//	       System.out.println(student.contains(1));
//	       System.out.println(student.addAll(student2));
//	       //System.out.println(student.size());
//	       System.out.println(student.remove(1));
//	       System.out.println(student);
//	       //System.out.println(student.removeAll(student2));
//	       System.out.println(student.get(1));
//	       }
	public static void main(String[] args) {
		LIstExample2 obj = new LIstExample2();
		obj.studentArrayList();
		//obj.studentLinkedList();

	}

}
