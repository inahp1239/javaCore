package collections.arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args){
        
        List<String> arr = new ArrayList<String>();
        arr.add("hello");
        arr.add("world");
        arr.add("hello 1");
        arr.add("world 1");


        List<String> linked = new LinkedList<>();
        linked.add("list 1");
        linked.add("list 2");
        linked.add("list 3");

        // System.out.println(arr);
        // for(String i : arr){
        //     System.out.println(i);
        // }

        // the get( index value ) method will give you the index which you specified from the list;
        // System.out.println(arr.get(0));

        // this set() method is only can set with in the array size only it can add at list index (which is out of bound exeption);
        // arr.set(2,"bye"); 
        
        // size() method returns the size of the list;
        // System.out.println(arr.size());

        // this clear() method will remove every single element in the list ;
        // arr.clear();

        // contains() method check the value we passed is present inside the list or not ;
        // if present returns true or returns flase;
        // System.out.println(arr.contains("hello"));

        
        // addAll() method adds another list into another list; 
        // the list might be different ;
        // here we are add linked list into arraylist ;
        // arr.addAll(linked);

        // arr.remove(0); // remove()  will remove the element from list desired index;
        
        System.out.println(arr.getClass()); // it will give the class name of the type of the list we are using

        for(String i : arr){
            System.out.println(i);
        }

        
    }
}
