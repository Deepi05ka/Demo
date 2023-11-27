package com.MapConcepts;

import java.util.LinkedHashMap;
import java.util.Map;

public class Example2_Linkedhashmap_prog {

	public static void main(String[] args) {
		//LinkedHashMap<Integer,String> de = new LinkedHashMap<Integer,String>();
		Map de =new LinkedHashMap();
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
		

	}

}
