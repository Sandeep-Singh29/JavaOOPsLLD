package prototypedesignpattern.cloneobject;

import prototypedesignpattern.baseinterface.Prototype;

/**
 * Author: Sandeep Singh
 * Date: 11/02/25
 */

public class Car implements Prototype {

    int wheel;
    boolean isAutoStart;
    private String carName;

    public Car() {
    }

    public Car(int wheel, boolean isAutoStart, String carName) {
        this.wheel = wheel;
        this.isAutoStart = isAutoStart;
        this.carName = carName;
    }

    @Override
    public Prototype clone() {
        return new Car(wheel,isAutoStart,carName);
    }
}
