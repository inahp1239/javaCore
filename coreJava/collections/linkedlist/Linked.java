package collections.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Linked{
    public static void main(String[] args){
        List<Integer> linkedlist = new LinkedList<Integer>();

        linkedlist.add(1); // add() method add or insert a new value into the list ;
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);


        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        // linkedlist.set(2,5); // set() method sets a new value in desired index;

        // linkedlist.remove(0); // remove()  will remove the element from list desired index;


        // linkedlist.addAll(arr);  //addAll() method adds another list into another list;  

        for(Integer i : linkedlist){
            System.out.println(i);
        }


    }
}