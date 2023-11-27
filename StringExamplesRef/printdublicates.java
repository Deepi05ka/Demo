package StringExamplesRef;                                           

public class printdublicates {

	public static void main(String[] args) {
		int a[]= {1,1,2,3,4,2,3};
		int i,j;
		for(i=0;i<a.length;i++) {
			int c=0;
			for(j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.print(a[i]);
				}
				
			}
			
			
//			if(c==0) {
//				System.out.print(a[i]);
//			}
			//System.out.print(a[i]);
		}
		

	}

}
