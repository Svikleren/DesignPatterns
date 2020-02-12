package structural.bridge;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(new Toyota());
        vehicle.drive();

        Vehicle vehicle1 = new Track(new Audi());
        vehicle1.drive();
    }
}
