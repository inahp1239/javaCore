package inheritence.vehical;

import inheritence.parent.Vehical;

public class Truck extends Vehical{

    private String steering;
    private String musicSystem;
    private String airConditioner;
    private boolean container;
    
    public Truck() {
        super();
        this.steering = "long";
        this.musicSystem = "on";
        this.airConditioner = "on";
        this.container = true;
    }

    public Truck(String engine, int wheels, int seats, int fueltank, String ligths ,String steering, String musicSystem, String airConditioner, boolean container) {
        
        super(engine , wheels, seats , fueltank , ligths );

        this.steering = steering;
        this.musicSystem = musicSystem;
        this.airConditioner = airConditioner;
        this.container = container;
    }

    public String getSteering() {
        return steering;
    }

    public String getMusicSystem() {
        return musicSystem;
    }


    public String getAirConditioner() {
        return airConditioner;
    }

    public boolean getContainer() {
        return container;
    }

    @Override
    public String toString() {
        return "Truck [ engine=" + getEngine() + ", wheels=" + getWheels() + ", seats=" + getSeats() + ", fueltank=" + getFueltank() + ", ligths= " + getLights() +", steering=" + getSteering() + ", musicSystem=" + getMusicSystem() +  ", airConditioner=" + getAirConditioner() + ", container=" + getContainer() + "]";
    }

    //return "Truck [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats + ", fueltank=" + fueltank+ ", ligths=" + ligths + " [steering=" + steering + ", musicSystem=" + musicSystem + ", airConditioner=" + airConditioner + ", container=" + container + "]";
    
}