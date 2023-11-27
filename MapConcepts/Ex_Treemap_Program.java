package com.MapConcepts;

import java.util.Map;
import java.util.TreeMap;

public class Ex_Treemap_Program {

	public static void main(String[] args) {
		TreeMap de = new TreeMap();
		de.put(100, "anu");
		de.put(101, "bala");
		de.put(104,"deepika");
		de.put(102, "anish");
		de.put(103, "chintu");
		de.put(104, "deepika");
		de.put(105, null);
		System.out.println(de);
		System.out.println(de.containsKey(100));
		System.out.println(de.containsValue("bala"));
		System.out.println(de.isEmpty());
		System.out.println(de.equals(1));
		System.out.println(de.get(102));
		System.out.println(de.replace(100, "ss"));
		System.out.println(de);
		System.out.println(de.entrySet());
		System.out.println(de.descendingKeySet());
        System.out.println(de.descendingMap());
        System.out.println("first "+de.firstEntry());
        System.out.println("last "+de.lastKey());
        System.out.println(de.tailMap(101));
        System.out.println(de.headMap(104));
        System.out.println(de.keySet());
        
	}

}
