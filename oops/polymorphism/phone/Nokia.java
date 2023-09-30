package polymorphism.phone;

import polymorphism.parent.Phone;

public class Nokia extends Phone{

    // Here we are we don't have any method like features method having in a Samsung class . It can inherit those methods from parent class. 

    // this is a parameterised constructer which can need to be passed of string type of a model name .
    public Nokia(String model){
        super(model);
    }

}