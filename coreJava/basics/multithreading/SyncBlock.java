package basics.multithreading;

class Sync{

      public void print(){


        // synchronized block will allow to synchronized within the bolck of code / statements only 
        // which makes the code execution time will reduce better than the synchronized mehtods 
        // (which allows all with in the method to synchronized which takes more time)
        /* start */
        synchronized (this){
            for(int i = 10 ; i< 20 ;i++){
                System.out.println(i+" "+Thread.currentThread().getName());
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("----------------------------------");
        }
        /* end */
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("----------------------------------");
    }
}

public class SyncBlock {
    static long total = 0;
    static long total1 = 0;
    public static void main(String[] args){
        Sync s1 = new Sync();

        
        new Thread(new Runnable(){

            @Override
            public void run() {
                long start = System.currentTimeMillis();
                s1.print();
                long end = System.currentTimeMillis();
                total = end-start;
                System.out.println("Thread 0  total time: "+total);
            }

        }).start();

        

        
        new Thread(new Runnable(){

            @Override
            public void run() {
                long start1 = System.currentTimeMillis();
                s1.print();
                long end1 = System.currentTimeMillis();
                total1 = end1-start1;
                System.out.println("Thread 1  total time: "+total1);
            }

        }).start();
        
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // System.out.println("total time :" + ( total + total1 ));
    }
}

// output without block :-

// try 1
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
// ----------------------------------
// ----------------------------------
// 10 Thread-1
// Thread 0  total time: 1057
// 11 Thread-1
// 12 Thread-1
// 13 Thread-1
// 14 Thread-1
// 15 Thread-1
// 16 Thread-1
// 17 Thread-1
// 18 Thread-1
// 19 Thread-1
// ----------------------------------
// ----------------------------------
// Thread 0  total time: 2063

// try -2
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
// ----------------------------------
// ----------------------------------
// 10 Thread-1
// Thread 0  total time: 2063
// 11 Thread-1
// 12 Thread-1
// 13 Thread-1
// 14 Thread-1
// 15 Thread-1
// 16 Thread-1
// 17 Thread-1
// 18 Thread-1
// 19 Thread-1
// ----------------------------------
// ----------------------------------
// Thread 1  total time: 4069



// output with block:-

// try 1
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
// ----------------------------------
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
// ----------------------------------
// Thread 0  total time: 1036
// ----------------------------------
// ----------------------------------
// Thread 0  total time: 1547

// try 2

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
// ----------------------------------
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
// ----------------------------------
// ----------------------------------
// Thread 1  total time: 2106
// ----------------------------------
// Thread 0  total time: 2624