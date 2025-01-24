package strategydesignpattern.vehicle;

import strategydesignpattern.drivestrategy.DriveStrategy;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class Vehicle {

    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }

}
