package abstraction.child;

import abstraction.parent.Laptop;

public class Lenovo extends Laptop{

    // giving a body to a method of inherited method of an abstract type.
    @Override
    public void call() {
        System.out.println("Yes,i can call.But,I need some other device help to make a call");
    }
    
}
