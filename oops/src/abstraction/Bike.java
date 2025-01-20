package abstraction;

public class Bike extends Vehicle {

    @Override
    public String start() {
        System.out.println("Call Parent Start Method : " + super.start());
        return "Bike Start";
    }

    @Override
    public String vehicleType() {
        return "Super Bike Start..!!";
    }
}
