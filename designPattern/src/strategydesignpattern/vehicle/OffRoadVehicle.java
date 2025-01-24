package strategydesignpattern.vehicle;

import strategydesignpattern.drivestrategy.SpecialDriveStrategy;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new SpecialDriveStrategy());
    }
}
