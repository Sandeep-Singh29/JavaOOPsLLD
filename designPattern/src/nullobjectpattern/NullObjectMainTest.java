package nullobjectpattern;

/**
 * Author: Sandeep Singh
 * Date: 02/02/25
 */

public class NullObjectMainTest {
    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getVehicleObject("jsak");
        printVehicle(car);

    }

    private static void printVehicle(Vehicle vehicle) {
        System.out.println("Tank Capacity :  " + vehicle.getTankCapacity());
        System.out.println("Seat Capacity :  " + vehicle.getSeatCapacity());

    }

}
