package factorydesignpattern.shapefactory;

import factorydesignpattern.shape.Circle;
import factorydesignpattern.shape.Rectangle;
import factorydesignpattern.shape.Square;

/**
 * Author: Sandeep Singh
 * Date: 28/01/25
 */

public class ShapeFactory {

    private  Shape shape;


    public Shape getShape(String shape) {
        if (shape.contains("rec")) {
            return new Rectangle();
        } else if (shape.contains("cir")) {
            return new Circle();
        }
        return new Square();
    }


}
