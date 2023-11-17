package abstraction.main;

import abstraction.parent.Phone;
import abstraction.child.Samsung;

import abstraction.parent.Laptop;
import abstraction.child.Lenovo;

public class Main {
    public static void main(String[] args){

        Phone phone = new Samsung();
        phone.call();

        System.out.println("----------------------------------------------------------------");

        Laptop laptop = new Lenovo();
        laptop.call();
        
    }
}
