package inheritence.vehical;

import inheritence.parent.Vehical;

public class Car extends Vehical{
    private String steering;
    private String musicSystem;
    private String seatBelt;
    private String airConditioner;
    private String fridge;
    private String entertainmentSystem;
    
    public Car() {
        super();
        this.steering = "long";
        this.musicSystem = "on";
        this.seatBelt = "on";
        this.airConditioner = "on";
        this.fridge = "on";
        this.entertainmentSystem = "on";
    }

    public Car(String engine, int wheels, int seats, int fueltank, String ligths ,String steering, String musicSystem, String seatBelt, String airConditioner, String fridge,String entertainmentSystem) {
        
        super(engine , wheels, seats , fueltank , ligths );

        this.steering = steering;
        this.musicSystem = musicSystem;
        this.seatBelt = seatBelt;
        this.airConditioner = airConditioner;
        this.fridge = fridge;
        this.entertainmentSystem = entertainmentSystem;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }

    public String getSeatBelt() {
        return seatBelt;
    }

    public String getAirConditioner() {
        return airConditioner;
    }

    public String getFridge() {
        return fridge;
    }

    public String getEntertainmentSystem() {
        return entertainmentSystem;
    }

    @Override
    public String toString() {
        return "Car [ engine=" + getEngine() + ", wheels=" + getWheels() + ", seats=" + getSeats() + ", fueltank=" + getFueltank() + ", ligths= " + getLights() +", steering=" + getSteering() + ", musicSystem=" + getMusicSystem() + ", seatBelt=" + getSeatBelt() + ", airConditioner=" + getAirConditioner() + ", fridge=" + getFridge() + ", entertainmentSystem="+ getEntertainmentSystem() + "]";
    }
  
}