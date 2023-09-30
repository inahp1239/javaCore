package polymorphism.phone;

import polymorphism.parent.Phone;

public class Samsung extends Phone{

    // this is a parameterised constructer which can need to be passed of string type of a model name .

    public Samsung(String model){
        super(model);
    }

    // when this method called it prints a string of "Android flagship" .
    public void features(){
        System.out.println("Android flagship");
    }

}