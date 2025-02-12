package abstractfactordesignpattern.carimpl;

import abstractfactordesignpattern.abstractfactory.AbstractFactory;
import abstractfactordesignpattern.car.Car;
import abstractfactordesignpattern.car.ecnomicimpl.EconomicCar1;
import abstractfactordesignpattern.car.ecnomicimpl.EconomicCar2;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class EcnomicCarFactory implements AbstractFactory {

    @Override
    public Car getInstance(int price) {
        if (price <= 2000000) {
            return new EconomicCar1();
        } else if (price >= 2000000) {
            return new EconomicCar2();
        }
        return null;
    }
}
