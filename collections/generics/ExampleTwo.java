package collections.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


class Data<T>{
    private T var ;

    public Data(T var) {
        this.var = var;
    }

    public T getVar() {
        return var;
    }
    
}

public class ExampleTwo {


    public static void main(String[] args){


        // here we are using a Data class of any type of Object of List to work with;
        List<Data<Object>> arr = new ArrayList<Data<Object>>();
        arr.add(new Data<Object>("hello"));
        arr.add(new Data<Object>(55));
        arr.add(new Data<Object>(65.66));
        arr.add(new Data<Object>('$'));
        

        ListIterator<Data<Object>> i = arr.listIterator();
        while(i.hasNext()){
            System.out.println(i.next().getVar());
        }

        // here we are using a Data class of string type of List to work with;

        System.out.println("----------------------------");

            List<Data<String>> arr1 = new ArrayList<Data<String>>();
        //   ^     ^     ^
        //   |     |     |
        //   |     |   this is a String type generic type of a Data class;
        //   |    this is a class of data type which can accept of string type generic :
        // this is a List from collection which can accept of Data class generic values:
        arr1.add(new Data<String>("hello"));
        arr1.add(new Data<String>("world"));
        arr1.add(new Data<String>("L"));
        arr1.add(new Data<String>("JJ"));
        

        ListIterator<Data<String>> j = arr1.listIterator();
        while(j.hasNext()){
            System.out.println(j.next().getVar());
        }
    }
}
