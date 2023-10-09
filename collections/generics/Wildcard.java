package collections.generics;

import java.util.ArrayList;
import java.util.List;

// This is a class that represents a Vehicle with a unique ID.
class Vehicle {
    private int VehicleId;
 
    public Vehicle(int vehicleId) {
        super();
        VehicleId = vehicleId;
    }
 
    public int getVehicleId() {
        return VehicleId;
    }
 
    @Override
    public String toString() {
        return "Vehicle [VehicleId=" + VehicleId + "]";
    }
}
 
// This is a class that represents a Car, which is a subclass of Vehicle.
class Car extends Vehicle {
    private String CarModel;
 
    public Car(int vehicleId, String carModel) {
        super(vehicleId);
        CarModel = carModel;
    }
 

    public String getCarModel() {
        return CarModel;
    }
 

    @Override
    public String toString() {
        return "Car [CarModel=" + CarModel + "]";
    }
}

public class Wildcard {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(new Vehicle(10));
        list.add(new Vehicle(11));
        list.add(new Vehicle(12));
        list.add(new Vehicle(13));
        list.add(new Car(14, "A14"));

        display(list);
    }
 

    public static void display(List<?> list) {
                                    // ^
                                    // this reprasents the wild card generic type ; when we don't know which kind of type to be placed we use wild card;

        for (Object element : list) {
            System.out.println(element);
        }
    }
}
