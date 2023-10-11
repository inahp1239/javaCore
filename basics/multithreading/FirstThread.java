package somemorebasics.multithreading;


// this is one of the way to create thread is to extend Thread class ;

class First  /*  */ extends Thread  /*  */{

    public void run(){
        for(int i = 10 ;i < 20 ;i++){
            System.out.println(i + " " + Thread.currentThread().getName()) ;
            try {

                // this sleep method is may raise an exception so we need to cover it with try and catch block ;
                 
                sleep(i*10);  // this is a sleep method , it will go to sleep for a given time ; 1000 is one second of our time , 100 is one millie second of our time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class FirstThread {
    public static void main(String[] args) throws InterruptedException{
        First first = new First();
        First second = new First();

        long start = System.currentTimeMillis(); // this give the starting time of the new threads ;
        
        first.start();  // to start and run the created thread  of first ;
        System.out.println("hello 0");
        second.start();  // to start and run the created thread  of second ;
        System.out.println("hello 2");

        first.join();   // join method for the first thread ;

        System.out.println("hello 3");

        second.join();  // join method for the second thread ;

        System.out.println("hello 4 ");

        System.out.println("hello 5");

        long end = System.currentTimeMillis();  // this give the starting time of the new threads ;

        System.out.println("start : "+start + " , end : " + end);

        System.out.println("total time taken is : " +  (end - start));




        // before join method all the threads works simultanously together ;
        // after join method main method is hold back until the all other threads are to be done with their exection ;

    }
}


// output :-

// hello 0
// hello 2
// 10 Thread-1
// 10 Thread-0
// 11 Thread-0
// 11 Thread-1
// 12 Thread-0
// 12 Thread-1
// 13 Thread-0
// 13 Thread-1
// 14 Thread-0
// 14 Thread-1
// 15 Thread-0
// 15 Thread-1
// 16 Thread-1
// 16 Thread-0
// 17 Thread-1
// 17 Thread-0
// 18 Thread-1
// 18 Thread-0
// 19 Thread-0
// 19 Thread-1
// hello 3
// hello 4 
// hello 5
// start : 1697016266297  , end : 1697016267782
// total time taken is : 1485