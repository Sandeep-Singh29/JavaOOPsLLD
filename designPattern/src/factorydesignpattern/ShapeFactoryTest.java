package factorydesignpattern;

import factorydesignpattern.shapefactory.Shape;
import factorydesignpattern.shapefactory.ShapeFactory;

/**
 * Author: Sandeep Singh
 * Date: 28/01/25
 */

public class ShapeFactoryTest {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape cir = shapeFactory.getShape("sq");
        System.out.println(cir.draw());

    }

}
