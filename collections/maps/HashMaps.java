package collections.maps;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args){

        // HashMap will never give a same order of list ;
        // It will give a random order ;
        // It should be consider when we use the HashMap ;
        // If we need a ordered list we may need to use the TreeMap ;

        Map<Integer,String> map = new HashMap<Integer,String>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");

        // to get a value of a key ;
        // System.out.println(map.get(3));

        // one way to print the map values ;
        // map.entrySet() contains the set of all key value pairs ;
        // we can iterate through it

        // for(Map.Entry<Integer,String> i : map.entrySet()){
        //     System.out.println(i);
        // }

        // another way to access the map values ;

        // for(Map.Entry<Integer,String> i : map.entrySet()){
        //     System.out.println("Key : "+ i.getKey() + " Value : " + i.getValue());
        // }


        // map.keySet() contain key values only ;
        // with those key values we can iterate entire map set;

        // for(Integer i : map.keySet()){
        //     System.out.println("Key : "+ i + " Value : " + map.get(i) );
        // }

        // another way to iterate is use the Iterator with Entry as its genaric type ;
        Iterator< Entry<Integer,String> > i = map.entrySet().iterator();
        
        while(i.hasNext()){
            Entry<Integer,String> temp = i.next();
            System.out.println("Key : "+ temp.getKey() + " Value : " + temp.getValue() );
        }

    }
}
