package com.CollectionProg;

import java.util.TreeSet;

public class Example3SETs {

	public static void main(String[] args) {
		TreeSet <Integer> no = new TreeSet<Integer>();
		no.add(2);
		no.add(4);
		no.add(3);
		no.add(6);
		no.add(8);
		System.out.println(no);
		System.out.println(no.clone());
		System.out.println(no.ceiling(5));
		System.out.println(no.clone());
		System.out.println(no.descendingSet());
		System.out.println(no.equals(5));
		System.out.println(no.contains(2));
		System.out.println(no.hashCode());
		//no.clear();
		System.out.println(no.isEmpty());
		//System.out.println(no.remove(8));
		System.out.println(no.size());
		System.out.println(no.descendingIterator());
		System.out.println(no.first());
		System.out.println(no.last());
		System.out.println(no);
		System.out.println("floor "+no.floor(3));
		System.out.println(no.lower(4));
		System.out.println(no.higher(3));
		System.out.println(no);
//		System.out.println(no.pollFirst());
//		System.out.println(no);
//		System.out.println(no.pollLast());
//		System.out.println(no);
		System.out.println("tailset "+no.tailSet(3));
		System.out.println("headset "+no.headSet(6));
		System.out.println(no.subSet(2, 6));
	}

}
