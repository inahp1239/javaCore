package collections.sorting;

// information about collections framework;
// https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sorting {
    public static void main(String[] args){
        Set<String> set = new HashSet<>();

        set.add("string");
        set.add("set");
        set.add("hashset");
        set.add("array");
        set.add("integer");

        List<String> list = new ArrayList<>();

        list.addAll(set);
        Collections.sort(list); // it sorts on the natural ordering ;

        for(String i : list){
            System.out.println(i);
        }

        // this below uses a binary search to the element is prsent or not 
        // if it present then prints the index number else -1;
        System.out.println(Collections.binarySearch(list, "array"));
        System.out.println(Collections.binarySearch(list, "string"));

    }
}
