package decoratordesignpattern;

import decoratordesignpattern.pizza.BasePizza;
import decoratordesignpattern.pizza.FarmHouse;
import decoratordesignpattern.pizza.Margerita;
import decoratordesignpattern.topping.ExtraCheese;
import decoratordesignpattern.topping.PaneerWithCorn;

/**
 * Author: Sandeep Singh
 * Date: 28/01/25
 */

public class PizzaTest {

    public static void main(String[] args) {

        BasePizza basePizza = new ExtraCheese(new Margerita());
        int Margerita = basePizza.cost();
        System.out.println("Cost of Margerita with Extra Cheese :  " + Margerita);

        // Pizza with Extra cheese and pannerwith corn
        PaneerWithCorn paneerWithCorn = new PaneerWithCorn(new ExtraCheese(new FarmHouse())); // 200+20+70
        int paneerWithCornCost = paneerWithCorn.cost();
        System.out.println("Cost of paneerWithCorn with Extra Cheese :  " + paneerWithCornCost);

    }

}
