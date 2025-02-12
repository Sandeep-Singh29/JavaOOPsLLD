package abstractfactordesignpattern;

import abstractfactordesignpattern.abstractfactory.AbstractFactory;
import abstractfactordesignpattern.abstrcatfactoryproducer.AbstrcatFactoryProducer;
import abstractfactordesignpattern.car.Car;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class AbstractFactoryMainTest {
    public static void main(String[] args) {
        AbstrcatFactoryProducer abstrcatFactoryProducer = new AbstrcatFactoryProducer();
        AbstractFactory abstractFactory = abstrcatFactoryProducer.getFactoryInstance("Economic");
        Car instance = abstractFactory.getInstance(3000000);
        System.out.println(instance.getTopSpeed());
        AbstractFactory abstractFactory1 = abstrcatFactoryProducer.getFactoryInstance("Luxury");
        Car instance1 = abstractFactory1.getInstance(4000000);
        System.out.println(instance1.getTopSpeed());

    }
}
