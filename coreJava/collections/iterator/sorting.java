package collections.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
// import java.util.ListIterator;

public class sorting {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(57);
        arr.add(34);
        arr.add(45);
        arr.add(9);
        arr.add(5);
        arr.add(2);
        arr.add(7);
        arr.add(14);


        arr.sort(null); // this line of code will sort the list 

        // this line of code uses a collections framework to reverse the list
        Collections.reverse(arr); 

        
        Iterator<Integer> i = arr.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }

        // ListIterator<Integer> it = arr.listIterator(arr.size());

        // while(it.hasPrevious()){
        //     System.out.println(it.previous());
        // }


    }
}
