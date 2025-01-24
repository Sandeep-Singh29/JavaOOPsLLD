package strategydesignpattern.vehicle;

import strategydesignpattern.drivestrategy.NormalDriveStrategy;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class GoodsVehicle extends Vehicle {
    
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
