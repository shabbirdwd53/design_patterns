public class FourWheelerVehicle extends Vehicle{
    private boolean automatic;
    private boolean isDiesel;

    public FourWheelerVehicle(String engine, String model, boolean automatic, long price, boolean isDiesel) {
        super(engine, model, price);
        this.automatic = automatic;
        this.isDiesel = isDiesel;
    }

    protected FourWheelerVehicle clone() throws CloneNotSupportedException {
        return (FourWheelerVehicle) super.clone();
    }
}
