package inheritence.parent;



public class Vehical{
    private String engine;
    private int wheels;
    private int seats;
    private int fueltank;
    private String ligths;

    public Vehical() {
        engine = "petrol";
        wheels = 4;
        seats = 4;
        fueltank = 40;
        ligths = "LED";
    }

    public Vehical(String engine, int wheels, int seats, int fueltank, String ligths) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.fueltank = fueltank;
        this.ligths = ligths;
    }

    public String getEngine(){
        return engine;
    }

    public int getWheels(){
        return wheels;
    }

    public int getSeats(){
        return seats;
    }

    public int getFueltank(){
        return fueltank;
    }

    public String getLights(){
        return ligths;
    }

    @Override
    public String toString() {
        return "Vehical [engine=" + engine + ", wheels=" + wheels + ", seats=" + seats + ", fueltank=" + fueltank + ", ligths=" + ligths + "]";
    }

    

}