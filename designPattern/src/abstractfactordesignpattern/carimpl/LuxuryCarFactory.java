package abstractfactordesignpattern.carimpl;

import abstractfactordesignpattern.abstractfactory.AbstractFactory;
import abstractfactordesignpattern.car.Car;
import abstractfactordesignpattern.car.luxuryimpl.LuxuryCar1;
import abstractfactordesignpattern.car.luxuryimpl.LuxuryCar2;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class LuxuryCarFactory implements AbstractFactory {

    @Override
    public Car getInstance(int price) {
        if (price <= 3000000) {
            return new LuxuryCar1();
        } else if (price >= 3000000) {
            return new LuxuryCar2();
        }
        return null;
    }
}
