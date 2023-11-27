package Collectionref;

public class foreach {

	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int sum =0;
		System.out.println(a.length);
		for(int arr:a) {
			System.out.println(arr);
			sum = sum +1;
			}
		System.out.println("sum "+sum);
	}

}
