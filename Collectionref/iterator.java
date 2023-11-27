package Collectionref;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {

	public static void main(String[] args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(1);
		n.add(2);
		n.add(3);
		System.out.println(n);
		Iterator<Integer> n1= n.iterator();
		while(n1.hasNext()) {
		System.out.print(n1.next());
		}
	}

}
