package com.CollectionProg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListConcepts {
	public  void type1ArrayList() {
		List num = new ArrayList();
		List no =new ArrayList();
		no.add(400);
		no.add(459);
		no.add("deepika");
		System.out.println(no);
		
		num.add(200);
		num.add(50);
		num.add(100);
		System.out.println(num.contains(50));
		System.out.println(num);
		System.out.println(num.remove(1));
		System.out.println(num);
		System.out.println(num.size());
	    System.out.println(num.addAll(no));	
	    System.out.println(num.get(1));
		//System.out.println(num.removeAll(num));
		num.clear();
		System.out.println(num);
		num.containsAll(num);
		System.out.println(num);
	    System.out.println(num.get(0));
	}

	public static void main(String[] args) {
		ListConcepts obj = new ListConcepts();
		obj.type1ArrayList();
//		List<Integer> no = new ArrayList<Integer>();
//		no.add(1);
//		no.add(4);
//		no.add(2);
//		no.add(1);
//		no.add(null);
//		System.out.println(no);
//		
//		System.out.println();
//		List<Integer> no1 = new LinkedList<Integer>();
//		no1.add(1);
//		no1.add(4);
//		no1.add(2);
//		no1.add(1);
//		no1.add(null);
//		System.out.println(no1);
		
        
	}

}
