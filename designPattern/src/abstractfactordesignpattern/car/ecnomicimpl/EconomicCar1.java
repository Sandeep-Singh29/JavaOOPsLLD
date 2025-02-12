package abstractfactordesignpattern.car.ecnomicimpl;

import abstractfactordesignpattern.car.Car;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class EconomicCar1 implements Car {

    @Override
    public int getTopSpeed() {
        return 100;
    }
}
