package Evaluvation1.RunnableThread;

public class ThreadUsingRunnable implements Runnable{
	public static void main(String [] args) {
		ThreadUsingRunnable thread=new ThreadUsingRunnable();
		Thread t1 =new Thread(thread);  
		t1.start();  
	}
	public void run() {
		System.out.println("thread is running...");  
	}
}
