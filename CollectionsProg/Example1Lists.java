package com.CollectionsProg;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Example1Lists {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
           List name = new ArrayList();
           name.add(1);
           name.add(3);
           name.add(5);
           name.add(5);
           name.add(2);
           name.add(7);
           name.add(8);
           name.add(0);
           name.add(null);
           System.out.println(name);
           List nas = new ArrayList();
           nas.add("Deep");
           nas.add("Seep");
           nas.add("Fee");
           nas.add("gee");
           nas.add(null);
           System.out.println(nas);
           
           List value = new LinkedList();
           value.add(8);
           value.add(4);
           value.add(8);
           value.add(null);
           value.add(3);
           System.out.println(value);
           
	}

}
