package Evaluvation1.Overriding;

public class MethodOverridingEg {
	public static void main(String []args) {
		bike b=new bike ();
		b.run();
		b.run();
	}
}
class car{
	void run() {
		System.out.println("car started");
	}
}
class bike extends car{
	void run() {
	System.out.println("Bike is running safely");
	}
}



