package com.Multiple_Inheritance;

public class MultipleChild extends MultipleParent {
        public void CompanyDetails(){
        	System.out.println("Company Guidlines");
        }
	public static void main(String[] args) {
		MultipleChild obj = new MultipleChild();
		obj.login();
		obj.logout();
		obj.EmpDetails();
		obj.CompanyDetails();

	}

}
