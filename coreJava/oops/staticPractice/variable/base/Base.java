package staticPractice.variable.base;

public class Base{

    // static variable are declared at once and stored in the memory at only once ;
  
    // which means this static variable are like final / constant variable 
    // ,but we can modify it when ever we want ;
  
    // this static variable are only accessed without creating an instace of an 
    // object with in the same class;

    // in order to access in other class we need to use the class name instead of 
    // instane of a class object ;

    private static int num = 5;  // this is a static variable;

    public static void setNum(int n){ // setter method of a variable num ;
        num = n;
    }

    public static int getNum(){ // getter method of a variable num ;
        return num;
    }
}