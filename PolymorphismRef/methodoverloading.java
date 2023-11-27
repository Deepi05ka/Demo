package PolymorphismRef;

public class methodoverloading {
	public void add() {
		System.out.println("Addition");
	}
	public void add(float f) {
		System.out.println(f);
	}
  public void add(int a,int b) {
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		methodoverloading m = new methodoverloading();
		m.add();
		m.add(22.44f);
		m.add(2, 4);

	}

}
