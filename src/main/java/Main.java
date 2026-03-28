public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 2026, 32000.99);

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        System.out.println(car.isRunning);
    }
}
