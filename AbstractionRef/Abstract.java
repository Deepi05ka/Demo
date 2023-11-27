package AbstractionRef;

 abstract class vehicle{
	abstract void start();
	abstract void stop();
	}
 class car extends vehicle{
	 void start() {
		 System.out.println("Car is start");
	 }
	 void stop() {
		 System.out.println("car is stop");
	 }
 }
	 class bike extends vehicle{
		 void start() {
			 System.out.println("bike is start");
		 }
		 void stop() {
			 System.out.println("bike is stop");
		 }
 }
public class Abstract {

	public static void main(String[] args) {
		vehicle c = new car();
		vehicle b = new bike();
		c.start();
		c.stop();
		b.start();
		b.stop();

	}

}
