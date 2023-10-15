package basics.multithreading;

public class Concurrncypro {
	public static int counter = 0;
 
	public static void main(String[] args) throws InterruptedException {
 
		Thread thread1 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				for (int i = 1; i <= 10000; i++) {
					Concurrncypro.counter++;
				}
              System.out.println("The loops in thread1 is over");
			}
		});
 
		Thread thread2 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				for (int i = 1; i <= 10000; i++) {
					Concurrncypro.counter++;
				}
				System.out.println("The loops in thread2 is over");
			}
		});
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		System.out.println("The value of counter is " + Concurrncypro.counter);
 
	}
}

// Here is the problem that the hardware executes the thread in a random order because the harware is uses different configurations like lock and realse the resoureses etc;

// output:-
// The loops in thread1 is over
// The loops in thread2 is over
// The value of counter is 11587