package PolymorphismRef;

public class overriding2 extends overriding1{
	public void add(int a,int b) {
		System.out.println("addition is "+(a+b));
	}
	public void sub(int a,int b) {
		System.out.println("sub is "+ (a-b));
	}
	public void mul(int a,int b) {
		System.out.println("mul "+ a*b);
	}

	public static void main(String[] args) {
		overriding2  o = new overriding2 ();
		o.add(2, 2);
		o.sub(2, 2);
		o.mul(2, 2);

	}

}
