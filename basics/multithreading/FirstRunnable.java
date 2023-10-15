package basics.multithreading;

class Runable implements Runnable{

    @Override
    public void run() {
        for(int i = 0 ; i < 10 ; i++){
            try {
                Thread.sleep(i*50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i+" "+Thread.currentThread().getName());
        }
        // System.out.println();
    }

}

public class FirstRunnable {

    // Runnabe is a interface 
    // It has run method in it;
    public static void main(String[] args) throws InterruptedException{

        Thread t1 = new Thread(new Runable());
        Thread t2 = new Thread(new Runable());
                                //    ^
                                //    | 
                                //   This is the above Runable class which is implemented the Runnable interface


    
        t1.start(); // this will start the new thread 

        t2.start(); // this will start the new thread

        System.out.println("hello");

        t1.join(); // join may thorws an exception so we may need to throws an exception or try/catch them;
        System.out.println("IN MIDDLE OF JOIN MEHTODS");
        t2.join(); // join may thorws an exception so we may need to throws an exception or try/catch them;

        System.out.println("My");
        System.out.println("world");
    }
}


// output :-

// hello
// 0 Thread-1
// 0 Thread-0
// 1 Thread-1
// 1 Thread-0
// 2 Thread-1
// 2 Thread-0
// 3 Thread-1
// 3 Thread-0
// 4 Thread-1
// 4 Thread-0
// 5 Thread-1
// 5 Thread-0
// 6 Thread-0
// 6 Thread-1
// 7 Thread-0
// 7 Thread-1
// 8 Thread-0
// 8 Thread-1
// 9 Thread-0
// IN MIDDLE OF JOIN MEHTODS
// 9 Thread-1
// My
// world