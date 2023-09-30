package staticPractice.method.base;

public class Base{

    // static methods are used to access without creating an instance of a class object with-in same class ;

    private static int num = 5;  // this is a static variable;

    public static void setNum(int n){ // static setter method of a variable num ;
        num = n;
    }

    public static int getNum(){ // static getter method of a variable num ;
        return num;
    }
}