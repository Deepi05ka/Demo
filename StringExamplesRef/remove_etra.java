package StringExamplesRef;

import java.util.Scanner;

public class remove_etra {

	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s = "abacbadad";
		String newstrc="";
		for(i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(newstrc.indexOf(c)==-1) {
				newstrc= newstrc + c;
			}
			//System.out.print(c);
		}
		System.out.print(newstrc);
		
	}

}
