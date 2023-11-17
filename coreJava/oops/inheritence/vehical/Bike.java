package inheritence.vehical;

import inheritence.parent.Vehical;

public class Bike extends Vehical {
    private String handle;

    public Bike(){
        super();
        handle = "short";
    }

    public Bike(String handle,String engine, int wheels, int seats, int fueltank, String ligths){
        super( engine,  wheels,  seats,  fueltank,  ligths);
        this.handle = handle;
    }
       
    public String getHandle(){
        return this.handle;
    }

    @Override
    public String toString() {
        return "Bike [ engine=" + getEngine() + ", wheels=" + getWheels() + ", seats=" + getSeats() + ", fueltank=" + getFueltank() + ", ligths= " + getLights() +", handle=" + handle + "]";
    }
}