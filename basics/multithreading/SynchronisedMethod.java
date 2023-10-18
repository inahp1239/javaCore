package basics.multithreading;


// same object reference

class Sync{

    synchronized public void print(){
        for(int i = 10 ; i< 20 ;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("---------------------");
    }
}


public class SynchronisedMethod {
    public static void main(String[] args){

        /* Example 1 */

        /* Here we are using single reference objects  */
        /* which means that two threads are working same object reference  */
        /* Two different threads are working synchronised fashion */

        Sync s1 = new Sync();
        
        new Thread(new Runnable() {

            @Override
            public void run() {
                s1.print();
            }
            
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                s1.print();
            }
            
        }).start();

        /* Example 1 ends here */

        
        /* Example 2  */

        /* Here we are using two different reference objects  */
        /* which means that two different threads are working differently  */
        /* Two different threads are working indepently the their is no synchronised is working with total different threads */

       /*  Sync s2 = new Sync();
        Sync s3 = new Sync();

        new Thread(new Runnable() {

            @Override
            public void run() {
                s2.print();
            }
            
        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                s3.print();
            }
            
        }).start(); */

        /* Example 2 ends here */
    }   
}


// output without synchronization (same object reference):-

// 10 Thread-0
// 10 Thread-1
// 11 Thread-1
// 11 Thread-0
// 12 Thread-1
// 12 Thread-0
// 13 Thread-1
// 13 Thread-0
// 14 Thread-1
// 14 Thread-0
// 15 Thread-1
// 15 Thread-0
// 16 Thread-0
// 16 Thread-1
// 17 Thread-0
// 17 Thread-1
// 18 Thread-0
// 18 Thread-1
// 19 Thread-1
// 19 Thread-0
// ---------------------
// ---------------------


// output with synchronization (same object reference):-

// 10 Thread-0
// 11 Thread-0
// 12 Thread-0
// 13 Thread-0
// 14 Thread-0
// 15 Thread-0
// 16 Thread-0
// 17 Thread-0
// 18 Thread-0
// 19 Thread-0
// ---------------------
// 10 Thread-1
// 11 Thread-1
// 12 Thread-1
// 13 Thread-1
// 14 Thread-1
// 15 Thread-1
// 16 Thread-1
// 17 Thread-1
// 18 Thread-1
// 19 Thread-1
// ---------------------



// output with synchronization (different objects references):-

// 10 Thread-1
// 10 Thread-0
// 11 Thread-1
// 11 Thread-0
// 12 Thread-1
// 12 Thread-0
// 13 Thread-0
// 13 Thread-1
// 14 Thread-0
// 14 Thread-1
// 15 Thread-0
// 15 Thread-1
// 16 Thread-0
// 16 Thread-1
// 17 Thread-0
// 17 Thread-1
// 18 Thread-0
// 18 Thread-1
// 19 Thread-0
// 19 Thread-1
// ---------------------
// ---------------------