package collections.queue;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;


//                                              Summary of Deque methods
//                              First Element (Head)	        Last Element (Tail)
//                  Throws exception 	Special value	    Throws exception	Special value
// Insert	        addFirst(e)	        offerFirst(e)	    addLast(e)	        offerLast(e)
// Remove	        removeFirst()	    pollFirst()	        removeLast()	    pollLast()
// Examine	        getFirst()	        peekFirst()	        getLast()	        peekLast()



//    omparison of Queue and Deque methods
//  Queue Method	    Equivalent Deque Method
//  add(e)	            addLast(e)
//  offer(e)	        offerLast(e)
//  remove()	        removeFirst()
//  poll()	            pollFirst()
//  element()	        getFirst()
//  peek()	            peekFirst()

// This below link will give the more information about the dequeue
// https://docs.oracle.com/javase/8/docs/api/java/util/Deque.html#element--

// Some more methods 

// modifier or type

// boolean	            contains(Object o)
//                     Returns true if this deque contains the specified element.

// Iterator<E>	        descendingIterator()
//                     Returns an iterator over the elements in this deque in reverse sequential order.                    

// E	                element()
//                     Retrieves, but does not remove, the head of the queue represented by this deque (in other words, the first element of this deque).

// E	                getFirst()
//                     Retrieves, but does not remove, the first element of this deque.

// E               	getLast()
//                     Retrieves, but does not remove, the last element of this deque.

// terator<E>	        iterator()
//                     Returns an iterator over the elements in this deque in proper sequence.

public class DEQUEUE {
    public static void main(String[] args){
        // dequeue is like queue but it can operate on both sides ;

        Deque<Integer> dequeue1 = new LinkedBlockingDeque<>(3); // it throw an exception if the limit we provided is exceds ;
        dequeue1.addFirst(1);
        dequeue1.addFirst(2);
        dequeue1.addFirst(3);
        // dequeue1.add(4);

        for(Integer i : dequeue1){
            System.out.println(i);
        }
        System.out.println("+++----------------------------------+++");


        Deque<Integer> dequeue2 = new LinkedBlockingDeque<>(3); // it throw an exception if the limit we provided is exceds ;
        dequeue2.addLast(1);
        dequeue2.addLast(2);
        dequeue2.addLast(3);
        // dequeue1.add(4);

        for(Integer i : dequeue2){
            System.out.println(i);
        }
        System.out.println("+++----------------------------------+++");



        Deque<Integer> dequeue3 = new LinkedBlockingDeque<>(3); // iteven though its limit exceeds the offerFirst() methods doesn't throw any error;
        dequeue3.offerFirst(1);
        dequeue3.offerFirst(2);
        dequeue3.offerFirst(3);
        dequeue3.offerFirst(4);

        // it just offer to the queue if it fits then push into the queue else it return flase when we print it;
        System.out.println(        dequeue3.offerFirst(4)        );  

        for(Integer i : dequeue3){
            System.out.println(i);
        }
        System.out.println("+++----------------------------------+++");


        Deque<Integer> dequeue4 = new LinkedBlockingDeque<>(3); // iteven though its limit exceeds the offerFirst() methods doesn't throw any error;
        dequeue4.offerLast(1);
        dequeue4.offerLast(2);
        dequeue4.offerLast(3);
        dequeue4.offerLast(4);

        for(Integer i : dequeue4){
            System.out.println(i);
        }
        System.out.println("+++----------------------------------+++");

    }
}

// output :-

// 3
// 2
// 1
// +++----------------------------------+++
// 1
// 2
// 3
// +++----------------------------------+++
// false
// 3
// 2
// 1
// +++----------------------------------+++
// 1
// 2
// 3
// +++----------------------------------+++