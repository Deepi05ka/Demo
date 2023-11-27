package com.CollectionProg;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample3 {

	public static void main(String[] args) {
		Set<Integer> tech=new LinkedHashSet<Integer>();
		tech.add(100);
		tech.add(800);
		tech.add(500);
		tech.add(400);
		tech.add(null);
		tech.add(100);
		System.out.println(tech);
		tech.remove(800);
		System.out.println(tech);
//		System.out.println("size of tech is:"+tech.size());
//		System.out.println("contains:"+tech.contains(null));
//		
//		Set<Integer> tech1=new LinkedHashSet<Integer>();
//		tech1.add(24);
//		tech1.add(54);
//		System.out.println("tech1 values:"+tech1);
//		tech1.addAll(tech);
//		System.out.println("addingall of : "+tech1);
//		
//		System.out.println("Containall:"+tech1.containsAll(tech));
//		tech1.removeAll(tech1);
//		System.out.println("Afer removeall of tech1:"+tech1);
//		tech1.clear();
//		System.out.println("After clear of :"+tech1);

	}

}
