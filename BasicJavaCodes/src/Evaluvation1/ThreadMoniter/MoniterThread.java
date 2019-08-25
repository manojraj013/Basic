package Evaluvation1.ThreadMoniter;

public class MoniterThread extends Thread {
	public static void main(String []args) throws InterruptedException {
		MoniterThread t1=new MoniterThread();
		MoniterThread t2=new MoniterThread();
		t1.start();
		System.out.println("Is Thread T1 Running "+t1.isAlive());
		System.out.println("Is Thread T2 Running "+t2.isAlive());

	}
	public void run() {
		System.out.println("Running.....");
		
	}
}
