package staticPractice.variable.main;

import staticPractice.variable.base.Base;

class Main{
    public static void main(String[] args){

        // Base num = new Base();

        // this line prints the initialised value to the x;
        System.out.println( Base.getNum() );

        // this setX method call update / modify the previous value ;
        Base.setNum(344) ;

        // this line prints the updated number ;
        System.out.println( Base.getNum() );
    }


}