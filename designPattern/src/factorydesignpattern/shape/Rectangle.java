package factorydesignpattern.shape;

import factorydesignpattern.shapefactory.Shape;

/**
 * Author: Sandeep Singh
 * Date: 28/01/25
 */

public class Rectangle implements Shape {
    @Override
    public String draw() {
        return "Rectangle";
    }
}
