package collections.queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;



// add
// boolean add(E e)
// Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
// Specified by:
// add in interface Collection<E>
// Parameters:
// e - the element to add
// Returns:
// true (as specified by Collection.add(E))
// Throws:
// IllegalStateException - if the element cannot be added at this time due to capacity restrictions
// ClassCastException - if the class of the specified element prevents it from being added to this queue
// NullPointerException - if the specified element is null and this queue does not permit null elements
// IllegalArgumentException - if some property of this element prevents it from being added to this queue


// offer
// boolean offer(E e)
// Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions. When using a capacity-restricted queue, this method is generally preferable to add(E), which can fail to insert an element only by throwing an exception.
// Parameters:
// e - the element to add
// Returns:
// true if the element was added to this queue, else false
// Throws:
// ClassCastException - if the class of the specified element prevents it from being added to this queue
// NullPointerException - if the specified element is null and this queue does not permit null elements
// IllegalArgumentException - if some property of this element prevents it from being added to this queue


// remove
// E remove()
// Retrieves and removes the head of this queue. This method differs from poll only in that it throws an exception if this queue is empty.
// Returns:
// the head of this queue
// Throws:
// NoSuchElementException - if this queue is empty


// poll
// E poll()
// Retrieves and removes the head of this queue, or returns null if this queue is empty.
// Returns:
// the head of this queue, or null if this queue is empty


// element
// E element()
// Retrieves, but does not remove, the head of this queue. This method differs from peek only in that it throws an exception if this queue is empty.
// Returns:
// the head of this queue
// Throws:
// NoSuchElementException - if this queue is empty


// peek
// E peek()
// Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
// Returns:
// the head of this queue, or null if this queue is empty



//         Throws exception	    Returns special value
// Insert	  add(e)	            offer(e)
// Remove	  remove()	            poll()
// Examine	  element()	            peek()

//the above lines of theory is copied from oracle website :)     
// https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html#element--

public class QUEUE {
    public static void main(String[] args){

        Queue<Integer> queue = new ArrayBlockingQueue<>(3);  // it throw an exception if the limit we provided is exceds ;

        // queue.remove();  // will throw an error at this point because we don't have any elements ;

        // queue.element(); // will give the first element in the queue;

        queue.add(1);
        queue.add(2);
        queue.add(3);
        // queue.add(4);

        for(Integer i : queue){
            System.out.println(i);
        }
        System.out.println("+++----------------------------------+++");

        Queue<Integer> queue1 = new LinkedBlockingQueue<>(3); // it throw an exception if the limit we provided is exceds ;
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        // queue1.add(4);

        for(Integer i : queue1){
            System.out.println(i);
        }
        System.out.println("+++----------------------------------+++");


        // but we use the offer() method instead of add() method it doesn't throw any error 
        // offer() will not add the extra elements to the limit of the queue ;

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(3);  
        queue2.offer(1);
        queue2.offer(2);
        queue2.offer(3);
        queue2.offer(4);

        for(Integer i : queue){
            System.out.println(i);
        }
        System.out.println("+++----------------------------------+++");

        Queue<Integer> queue3 = new LinkedBlockingQueue<>(3); 
        queue3.offer(1);
        queue3.offer(2);
        queue3.offer(3);
        queue3.offer(4);

        for(Integer i : queue1){
            System.out.println(i);
        }
        System.out.println("+++----------------------------------+++");     
        
        
    }
}
