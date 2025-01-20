package abstraction;

public class VehicleTest {

    public static void main(String[] args) {

        Vehicle bike = new Bike();
        System.out.println(bike.start());
        System.out.println(bike.vehicleType());
        Vehicle car = new Car();
        System.out.println(car.start());
        System.out.println(car.vehicleType());

    }
}
