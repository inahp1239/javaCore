package abstraction.child;

import abstraction.parent.Phone;

public class Samsung extends Phone{

    // giving a body to a method of inherited method of an abstract type.
    @Override
    public void call(){
        System.out.println("Yes,i hava a built-in call funtionality");
    }

}
