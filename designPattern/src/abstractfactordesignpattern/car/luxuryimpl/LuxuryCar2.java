package abstractfactordesignpattern.car.luxuryimpl;

import abstractfactordesignpattern.car.Car;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class LuxuryCar2 implements Car {

    @Override
    public int getTopSpeed() {
        return 300;
    }
}
