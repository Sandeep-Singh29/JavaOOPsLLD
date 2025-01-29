package decoratordesignpattern.topping;

import decoratordesignpattern.decorator.ToppingDecorator;
import decoratordesignpattern.pizza.BasePizza;

/**
 * Author: Sandeep Singh
 * Date: 28/01/25
 */

public class PaneerWithCorn extends ToppingDecorator {

    BasePizza basePizza;

    public PaneerWithCorn(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 70;
    }
}
