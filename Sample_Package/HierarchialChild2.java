package com.Sample_Package;

public class HierarchialChild2 extends HierarchialParent {
	public void show2(){
		System.out.println("Second child class use parent class propertites");
	}
	public static void main(String[] args) {
	
		HierarchialChild2 c = new HierarchialChild2();
		c.display();
		c.viewpoint();
		c.view();
		c.show2();

	}

}
