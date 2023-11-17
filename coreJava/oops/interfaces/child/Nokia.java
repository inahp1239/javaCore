package interfaces.child;

import interfaces.parent.Phone;


// this is a sub class Nokia of base class of Phone 
// by using implements key-word we can implement the methods here


public class Nokia implements Phone{

    @Override
    public String model(){
        return "Nokia 9 Pure View";
    }

    @Override
    public String processor() {
        return "SD 845";
    }

    @Override
    public int ram() {
        return 6;
    }

}