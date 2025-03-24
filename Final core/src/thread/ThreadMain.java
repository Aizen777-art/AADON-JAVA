package thread;

public class ThreadMain {
	
	public static void main(String[] args) {
		/*
		    MyThread t1 = new MyThread();
	        MyThread t2 = new MyThread();

	        t1.start(); // Starts thread t1
	        t2.start(); // Starts thread t2
	        */
		
		MyRunnable obj = new MyRunnable();
        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();
	}
}
