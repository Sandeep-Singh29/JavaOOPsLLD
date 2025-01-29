package decoratordesignpattern.pizza;

/**
 * Author: Sandeep Singh
 * Date: 28/01/25
 */

public class FarmHouse extends BasePizza {

    @Override
    public int cost() {
        return 200;
    }
}
