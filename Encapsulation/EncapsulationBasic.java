package Encapsulation;

public class EncapsulationBasic {
	private int a;
	public void set(int i) {
		a=i;
	}
	public int get() {
		return a;
	}

	public static void main(String[] args) {
		EncapsulationBasic obj = new EncapsulationBasic();
		obj.set(2);
		System.out.println(obj.get());
	}

}
