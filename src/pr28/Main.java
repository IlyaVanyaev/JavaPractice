package pr28;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Dodge", "Charger", 1969);
        car.start();

        car.drive(1000, 110);

        Car.Engine engine = new Car.Engine(800);
        engine.rev();
    }
}
