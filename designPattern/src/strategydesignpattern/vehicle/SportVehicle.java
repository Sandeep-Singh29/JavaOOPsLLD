package strategydesignpattern.vehicle;

import strategydesignpattern.drivestrategy.SportDriveStartegy;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class SportVehicle extends Vehicle {

    public SportVehicle() {
        super(new SportDriveStartegy());
    }
}
