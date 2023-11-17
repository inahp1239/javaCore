package staticPractice.method.main;

import staticPractice.method.base.Base;

class Main{
    public static void main(String[] args){

        // Base num = new Base();

        // this line prints the initialised value to the x;
        // Here we can access methods only using the class name.methodName ;
        System.out.println( Base.getNum() );

        // this setX method call update / modify the previous value ;
        Base.setNum(344) ;

        // this line prints the updated number ;
        System.out.println( Base.getNum() );
    }


}