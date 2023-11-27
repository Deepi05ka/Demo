package com.Sample_Package;

public class HierarchialChild1 extends HierarchialParent{
	public void show1(){
		System.out.println("First child use a parent class propertites");
	}
	public static void main(String[] args) {
		HierarchialChild1 obj = new HierarchialChild1();
		obj.display();
		obj.viewpoint();
		obj.view();
 	    obj.show1();
		
		

	}

}
