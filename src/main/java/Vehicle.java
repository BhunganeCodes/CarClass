public abstract class Vehicle {
    protected String name;
    protected int topSpeed;
    protected int year;
    protected double price;
    protected boolean isRunning = false;

    public abstract void start();
    public abstract void stop();

}
