package nullobjectpattern;

/**
 * Author: Sandeep Singh
 * Date: 02/02/25
 */

public class VehicleFactory {


    public static Vehicle getVehicleObject(String vehicleType) {

        vehicleType = vehicleType.toLowerCase();
        if (vehicleType.equals("car")) {
            return new Car();
        } else if (vehicleType.equals("bike")) {
            return new Bike();
        }
        return new NullVehicle();
    }


}
