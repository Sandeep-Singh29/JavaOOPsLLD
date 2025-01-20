package abstraction;

public class Car extends Vehicle {

    @Override
    public String start() {
        System.out.println(super.start());
        return "BMW Car Start Automatically";
    }

    @Override
    public String vehicleType() {
        return "Car is Running";
    }
}
