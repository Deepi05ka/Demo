package com.CollectionProg;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example2Sets {

	public static void main(String[] args) {
		Set<Integer> test = new HashSet<Integer>();
		test.add(2);
		test.add(8);
		test.add(6);
		test.add(6);
		test.add(1);
		test.add(5);
		test.add(null);
		System.out.println(test);
		
		Set<Integer> tes = new LinkedHashSet<Integer>();
		tes.add(2);
		tes.add(8);
		tes.add(6);
		tes.add(6);
		tes.add(1);
		tes.add(5);
		tes.add(null);
		System.out.println(tes);
		
		Set<Integer> te = new TreeSet<Integer>();
		te.add(2);
		te.add(8);
		te.add(6);
		te.add(6);
		te.add(1);
		te.add(5);
		//test.add(null);
		System.out.println(test);
		

	}

}
