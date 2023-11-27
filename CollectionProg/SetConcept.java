package com.CollectionProg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetConcept {

	public static void main(String[] args) {
		HashSet<Integer> no = new HashSet<Integer>();
		no.add(1);
		no.add(4);
		no.add(2);
		no.add(1);
		no.add(null);
		System.out.println(no);
		
		LinkedHashSet<Integer> no1 = new LinkedHashSet<Integer>();
		no1.add(1);
		no1.add(4);
		no1.add(2);
		no1.add(1);
		no1.add(null);
		System.out.println(no1);
		
		TreeSet<Integer> no2 = new TreeSet<Integer>();
		no2.add(1);
		no2.add(4);
		no2.add(2);
		no2.add(1);
		//no2.add(null);
		System.out.println(no2);
	}

}
