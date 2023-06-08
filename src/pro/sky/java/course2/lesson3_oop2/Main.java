package pro.sky.java.course2.lesson3_oop2;

public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[] {new Car("car1", 4), new Car("car2",4)};

        Truck[] trucks = new Truck[] {new Truck("truck1", 6), new Truck("truck2", 8)};

        Bicycle[] bicycles = new Bicycle[] {new Bicycle("bicycle1",2), new Bicycle("bicycle2",2)};

        Vehicle[] vehicles = new Vehicle[cars.length + trucks.length + bicycles.length];

        for (int i = 0; i < cars.length; i++) {
            vehicles[i] = cars[i];
        }
        for (int i = cars.length; i < cars.length + trucks.length; i++) {
            vehicles[i] = trucks[i - cars.length];
        }
        for (int i = cars.length + trucks.length; i < cars.length + trucks.length + bicycles.length; i++) {
            vehicles[i] = trucks[i - cars.length - trucks.length];
        }

        ServiceStation station = new ServiceStation();


        for (Car car : cars) {
            station.check(car);
        }
        for (Bicycle bicycle : bicycles) {
            station.check(bicycle);
        }
        for (Truck truck : trucks) {
            station.check(truck);
        }
    }
}
