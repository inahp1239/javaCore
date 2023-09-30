package interfaces.main;

import interfaces.child.*;
import interfaces.parent.Phone;

public class Main {
    //Driver class
    public static void main(String[] args){

        // this Phone class is act like a user defined data type and it can act as a polymorphism .
        // here Phone is a base class for Nokia and Samsung sub classes.      
        // new Nokia is called as nameless class.
        Phone nokia = new Nokia();
        System.out.println("\nthis is a nokia phone");
        System.out.println(nokia.model());
        System.out.println(nokia.processor());
        System.out.println(nokia.ram());


        Phone samsung = new Samsung();
        System.out.println("\nthis is a samsung phone");
        System.out.println(samsung.model());
        System.out.println(samsung.processor());
        System.out.println(samsung.ram());

    }
    
}
