public abstract class Vehicle {
    private String name;
    private int topSpeed;
    private int year;
    private double price;
    private boolean isRunning = false;

    public abstract void start();
    public abstract void stop();

}
