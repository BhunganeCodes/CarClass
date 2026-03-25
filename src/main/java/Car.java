public class Car {
    String make = "Toyota";
    String model = "Camry";
    int year = 2026;
    double price = 359555.99;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("The car's engine is running...");
    }

    void stop(){
        isRunning = false;
        System.out.println("The car's engine stopped running...");
    }
}
