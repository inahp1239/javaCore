package collections.comparing;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Name implements Comparable<Name>{
    private String name;

    public Name(String name){
        this.name = name;
    }

    // this compareTo() method overrides the original compareTo() method 
    // In order to we use to compareTo() method other than the existed data type on java  
    // like user created data types like here Name ;

    
    // this overrided method sorts based on the length of the string ;
    @Override
    public int compareTo(Name obj) {
        if (name.length() == obj.name.length()) {
			return 0;
		} else if (name.length() < obj.name.length()) {
			return -1;
		} else {
			return 1;
		}
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Comparables {
    public static void main(String[] args){


        List<Name> names = new LinkedList<>();
        names.add(new Name("William"));
        names.add(new Name("Isabella"));
        names.add(new Name("John"));
        names.add(new Name("Mary"));


        Collections.sort(names);

        for(Name i : names){
            System.out.println(i);
        }


    }
}
