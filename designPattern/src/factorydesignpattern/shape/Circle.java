package factorydesignpattern.shape;

import factorydesignpattern.shapefactory.Shape;

/**
 * Author: Sandeep Singh
 * Date: 28/01/25
 */

public class Circle implements Shape {

    @Override
    public String draw() {
        return "Circle";
    }
}
