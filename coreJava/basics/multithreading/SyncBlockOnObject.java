package basics.multithreading;

// chat gpt generated script
// Certainly, let's discuss the differences between the two code snippets.

// Code snippet 1:
// ```java
// public class MyClass {
//     private final Object lock = new Object();

//     public void synchronizedMethod() {
//         synchronized (lock) {
//             // Critical section, only one thread can execute this at a time
//             // Access shared resources here
//         }
//     }
// }
// ```

// Code snippet 2:
// ```java
// public class MyClass {
//     public void synchronizedMethod() {
//         synchronized (this) {
//             // Critical section, only one thread can execute this at a time
//             // Access shared resources here
//         }
//     }
// }
// ```

// 1. **Lock Object**: In the first example, a private `Object` named `lock` is explicitly created for the purpose of synchronization. 
// This gives more control over the lock and avoids potential issues that can arise when using `this` as the lock. In the second example, 
// `this` is used as the lock, which can potentially cause unintended locking conflicts with other parts of the code that may also use `this` 
// for synchronization.

// 2. **Scope of Synchronization**: In the first example, the scope of synchronization is based on the `lock` object, 
// allowing you to control the critical section precisely. In the second example, the synchronization is based on the current instance of 
// the class. If there are multiple instances of `MyClass`, each instance will have its own lock, and the critical section will be accessible 
// concurrently for different instances.

// 3. **Flexibility and Avoiding Deadlocks**: Using a dedicated lock object as in the first example provides more flexibility in managing 
// critical sections, allowing for a more controlled and predictable synchronization strategy. It helps avoid potential deadlocks and unwanted 
// interference between different parts of the code that use the same instance for synchronization.

// In summary, using a dedicated private lock object, as in the first example, is generally considered a better practice compared to using 
// `this` for synchronization. It helps to avoid potential issues and provides more control over synchronization in a multi-threaded 
// environment.



class Sync{

        private Object lock ;

        public void print(){


        // synchronized block will allow to synchronized within the bolck of code / statements only 
        // which makes the code execution time will reduce better than the synchronized mehtods 
        // (which allows all with in the method to synchronized which takes more time)
        /* start */
        synchronized (lock){
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

public class SyncBlockOnObject {
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

// output :-

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
// ----------------------------------
// Thread 0  total time: 2036
// ----------------------------------
// Thread 1  total time: 2553