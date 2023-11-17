package inheritence.demo;

import inheritence.vehical.*;

public class Demo {
    public static void main(String[] args){
        Bike bike = new Bike("short","petrol",4,5,30,"Led");
        System.out.println("\n"+bike.toString()+"\n");

        Car car = new Car();
        System.out.println(car.toString()+"\n");

        Truck t = new Truck();
        System.out.println(t.toString());
    }
    
}
