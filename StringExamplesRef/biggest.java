package StringExamplesRef;

public class biggest {

	public static void main(String[] args) {
		int []a = {7,6,9,3,4,2,1};
		int big = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>big) {
				big = a[i];
			}
		}
		System.out.println(big);

	}

}
