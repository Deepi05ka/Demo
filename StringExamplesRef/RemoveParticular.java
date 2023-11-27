package StringExamplesRef;

public class RemoveParticular {

	public static void main(String[] args) {
		String s = "abacbadad";
		int v=-1;
		String c="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='a') {
				c= c+ s.charAt(i);
			}
		}
		System.out.print(c);
	}

}
