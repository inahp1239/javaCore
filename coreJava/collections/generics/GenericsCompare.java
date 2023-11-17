package collections.generics;


class Data<T extends Comparable<T>> implements Comparable<T>{ 
    private T myVariable;    

    public Data(T myVariable) {
        this.myVariable = myVariable;
    }

    public T getMyVariable() {
        return myVariable;
    }

    @Override
    public int compareTo(T o){
        return getMyVariable().compareTo(o);
    }
    
}

public class GenericsCompare {
    public static void main(String[] args){
        Data<Integer> data = new Data<>(1);
        System.out.println(data.compareTo(1));
    }   
}