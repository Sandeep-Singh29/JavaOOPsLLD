package inheritance.usesealedclass;

/**
 * Author: Sandeep Singh
 * Date: 04/02/25
 */

public class TestVehicleMain {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Start Car
        Bike bike = new Bike();
        bike.start(); //Start Bike
        Vehicle vehicle = new Vehicle();
        vehicle.start(); //Start Vehicle
        Vehicle c1 = new Car();
        c1.start(); // Start Car
        c1.start();
    }
}
