package KeywordsRef;

public class This_keyword {
	int rollno;
	String name;
//	public This_keyword(int rollno,String name){
//		rollno =rollno;
//		name = name;
//		System.out.println("rollno is: "+rollno);
//		System.out.println("name is "+name);
//	}
	public This_keyword(int rollno,String name){
		this.rollno =rollno;
		this.name = name;
	}
	public void display() {
		System.out.println(rollno+" " +	name );
	}

	public static void main(String[] args) {
		This_keyword obj1 = new This_keyword(100,"Deepika");
		This_keyword obj2 = new This_keyword(101,"Monisha");
		obj1.display();
		obj2.display();

	}

}
