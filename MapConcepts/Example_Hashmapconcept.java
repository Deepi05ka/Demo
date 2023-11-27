package com.MapConcepts;

import java.util.HashMap;
import java.util.Map;

public class Example_Hashmapconcept {

	public static void main(String[] args) {
		HashMap<Integer,String> de = new HashMap<Integer,String>();
		//Map de = new HashMap();
		de.put(100, "anu");
		de.put(101, "bala");
		de.put(104,"deepika");
		de.put(102, "anish");
		de.put(103, "chintu");
		de.put(104, "deepika");
		de.put(105, null);
		de.put(null, "ali");
		de.put(null, "pavi");
		System.out.println(de);
		System.out.println(de.containsKey(100));
		System.out.println(de.containsValue("bala"));
		System.out.println(de.isEmpty());
		System.out.println(de.equals(1));
		System.out.println(de.get(102));
		System.out.println(de.replace(100, "ss"));
		System.out.println(de);
		System.out.println(de.entrySet());
//		

	}

}
