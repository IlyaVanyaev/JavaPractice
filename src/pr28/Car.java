package pr28;

public class Car implements Drive{
    private String label;
    private String model;
    private int year;

    public Car(String label, String model, int year) {
        this.label = label;
        this.model = model;
        this.year = year;
    }

    public void start() {
        System.out.println("Engine started. "+label+" "+model+" "+year+" is on the ride.");
    }

    // Анонимный класс
    public void drive(int distance, int speed) {
        Drive drive = (distance1, speed1) -> System.out.println("Drive " + distance1 + " kilometers at speed of " + speed1 + " kph.");
        drive.drive(distance, speed);
    }

    // Вложенный класс
    public static class Engine {
        private int hp;

        public Engine(int horsepower) {
            this.hp = horsepower;
        }

        public void info() {
            System.out.println("The power of the engine is " + hp + " horse power");
        }
    }
}
