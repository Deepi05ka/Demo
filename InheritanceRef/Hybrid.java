package InheritanceRef;

class A{
	void first() {
		System.out.println("First");
	}
}
class B extends A{
	void second() {
		System.out.println("second");
	}
}
class C extends B {
	void third() {
		System.out.println("third");
	}
}
class D extends A{
	void fourth() {
		System.out.println("Fourth");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		b.first();
		b.second();
		System.out.println();
		c.first();
		c.second();
		c.third();
		System.out.println();
		d.first();
		d.fourth();

	}

}
