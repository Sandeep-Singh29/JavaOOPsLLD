package strategydesignpattern;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class VehicleMainTest {

    public static void main(String[] args) {
        Vehicle sportVehicle = new SportVehicle();
        sportVehicle.drive();
    }
}
