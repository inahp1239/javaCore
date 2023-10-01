package collections.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Iteration {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        // An Iterator is an object that can be used to 
        // loop through collections, like ArrayList and HashSet  ;


        // Iterator<Integer> i = arr.iterator();

        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }


        // ListIterator is like a Iterator but it can only iterate only lists.
        // unlike Iterator it can go backward diraction too;
        // with the help of hasPrevious() (it is used to move in the list) and 
        // previous() (it is used to grab the element) methods 


        // in order to iterate backword we need to give the size of the 
        // list as parameter to its constructor ;

        ListIterator<Integer> i = arr.listIterator(arr.size());

        // for forward diraction 
        // while (i.hasNext()) {
        //     System.out.println(i.next());
        // }

        // for backward diraction 
        while (i.hasPrevious()) {
            System.out.println(i.previous());
        }

        

    }
}