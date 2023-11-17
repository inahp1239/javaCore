package collections.maps;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TREEMAP {
    public static void main(String[] args){

        // TreeMap is like a hashmap but this gives a same order ever single each time ;


        Map<Integer,String> treemap = new TreeMap<>();


        treemap.put(2,"two");
        treemap.put(3,"three");
        treemap.put(1,"one");
        
        treemap.put(4,"four");
        treemap.put(5,"five");

        // for(Integer i : treemap.keySet()){
        //     System.out.println("Key : " + i + " value : " + treemap.get(i));
        // }

            // to get a value of a key ;
        // System.out.println(treemap.get(3));

            // one way to print the map values ;
            // map.entrySet() contains the set of all key value pairs ;
            // we can iterate through it

        // for(Map.Entry<Integer,String> i : treemap.entrySet()){
        //     System.out.println(i);
        // }

            // another way to access the map values ;

        // for(Map.Entry<Integer,String> i : treemap.entrySet()){
        //     System.out.println("Key : "+ i.getKey() + " Value : " + i.getValue());
        // }


        // map.keySet() contain key values only ;
        // with those key values we can iterate entire map set;

        // for(Integer i : treemap.keySet()){
        //     System.out.println("Key : "+ i + " Value : " + map.get(i) );
        // }

            // another way to iterate is use the Iterator with Entry as its genaric type ;
        Iterator< Entry<Integer,String> > i = treemap.entrySet().iterator();
        
        while(i.hasNext()){
            Entry<Integer,String> temp = i.next();
            System.out.println("Key : "+ temp.getKey() + " Value : " + temp.getValue() );
        }

    }
}

// output :-

// Key : 1 Value : one
// Key : 2 Value : two
// Key : 3 Value : three
// Key : 4 Value : four
// Key : 5 Value : five