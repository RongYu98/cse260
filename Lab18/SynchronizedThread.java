import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedThread {

	static Integer sum = 0;
	private static ReentrantLock locker = new ReentrantLock();
	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool( 1000 );
		
		Task[] tasks = new Task[1000];
		
		for ( int i=0; i<tasks.length; i++ ) {
			tasks[i] = new Task();
			executor.execute(tasks[i]);
		}
		executor.shutdown();
		while (!executor.isTerminated()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
			}
		}
		System.out.println("Unsynchronized Sum: "+sum);
		
		ExecutorService executor2 = Executors.newFixedThreadPool( 1000 );
		sum = 0;
		Task2[] tasks2 = new Task2[1000];
		for ( int i=0; i<1000; i++ ) {
			tasks2[i] = new Task2();
			executor2.execute(tasks2[i]);
		}
		executor2.shutdown();
		
		while (!executor.isTerminated()) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException ex) {
			}
		}
		System.out.println("Synchronized Sum: "+sum);
	}
	
	
	public static class Task implements Runnable {
		public Task() {
		
		}
		public void run() {
			for ( int i=0; i<1000; i++) {
				sum++;
			}
		}
		
		
	}
	
	public static class Task2 implements Runnable {
		public Task2() {
		
		}
		public void run() {
			for ( int i=0; i<1000; i++) {
				locker.lock();
				sum++;
				locker.unlock();
			}
			
		}
		
		
	}
}
