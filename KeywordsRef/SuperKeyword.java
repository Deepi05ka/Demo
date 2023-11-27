package KeywordsRef;

class Animal{
	String s ="Super class variable";
	Animal(){
		System.out.println("Super class constructor");
	}
	Animal(String s){
		this();
		System.out.println("Super class parameterized constructor");
		
	}
	void animalmethod() {
		System.out.println("Super class method");
	}
}
class Dog extends Animal{
	String s ="Suber class variable";
	Dog(){
		super();
		System.out.println("Sub class constructor");
		
	}
	void Dogmethod() {
		System.out.println("Sub class method");
		//super.animalmethod();
	}
	void animalmethod() {
		System.out.println("singer priyanka");
		this.Dogmethod();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		//Dog d = new Dog();
		//d.Dogmethod();
		//d.animalmethod();
		Animal a = new Animal("cgn");
	}
}
