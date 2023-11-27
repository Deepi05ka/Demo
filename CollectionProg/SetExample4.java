package com.CollectionProg;

import java.util.Set;
import java.util.TreeSet;

public class SetExample4 {

	public static void main(String[] args) {
		Set<String> num= new TreeSet<String>();
		num.add("apple");
		num.add("mango");
		num.add("banana");
		//num.add(null);
		System.out.println(num);
        num.remove("apple");
        System.out.println(num);
		Set<Integer> tech=new TreeSet<Integer>(); 
		  tech.add(100); 
		  tech.add(800);
		  tech.add(500); 
		  tech.add(400); 
		  
		  //tech.add(null); 
		  tech.add(100);
		  System.out.println(tech);
		  System.out.println(tech.remove(800));
		  System.out.println(tech);
		  
		  System.out.println("size of tech is:"+tech.size());
		  System.out.println("contains:"+tech.contains(400));
		  
		  Set<Integer> tech1=new TreeSet<Integer>(); 
		  tech1.add(24); 
		  tech1.add(54);
		  System.out.println("tech1 values:"+tech1); 
		  tech1.addAll(tech);
		  System.out.println("addingall of : "+tech1);
		  
		  System.out.println("Containall:"+tech1.containsAll(tech));
		  tech.removeAll(tech); 
		  System.out.println("Afer removeall of tech1:"+tech);
		  tech1.clear();
		  System.out.println("After clear of :"+tech1);
	}

}
