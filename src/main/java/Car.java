public class Car extends Vehicle{
    String make = "Toyota";
    String model = "Camry";
    int year = 2026;
    double price = 359555.99;

    Car(String name, String model){
        this.name = name;
        this.model = model;
    }

    Car(String make, int year, double price){
        this.make = make;
        this.year = year;
        this.price = price;
    }

    @Override
    public void start(){
        this.isRunning = true;
        System.out.println("The car's engine is running...");
    }

    @Override
    public void stop(){
       this.isRunning = false;
        System.out.println("The car's engine stopped running...");
    }
}
