/**
 * This is abstract prototype.
 */
public abstract class Vehicle implements Cloneable {
    private String engine;
    private String model;
    private long price;

    public Vehicle(String engine, String model,  long price) {
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    protected Vehicle clone() throws CloneNotSupportedException {
        return (Vehicle) super.clone();
    }
}
