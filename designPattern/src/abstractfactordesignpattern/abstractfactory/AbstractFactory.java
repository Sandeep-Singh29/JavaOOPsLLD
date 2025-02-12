package abstractfactordesignpattern.abstractfactory;

import abstractfactordesignpattern.car.Car;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public interface AbstractFactory {

    public Car getInstance(int price);

}
