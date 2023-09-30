package interfaces.child;

import interfaces.parent.Phone;

// this is a sub class Nokia of base class of Phone 
// by using implements key-word we can implement the methods here

public class Samsung implements Phone {
    @Override
    public String model(){
        return "Samsung S23 Ultra";
    }

    @Override
    public String processor() {
        return "SD 8gen 2";
    }

    @Override
    public int ram() {
        return 12;
    }
    
}
