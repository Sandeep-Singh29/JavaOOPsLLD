package solidprinciples.interfacesegregationprinciple;

/**
 * Author: Sandeep Singh
 * Date: 23/01/25
 */

public class Chef implements ChefInterface {


    @Override
    public void cookFood() {
        System.out.println("Food Cook By Chef");
    }

    @Override
    public void decideMenu() {
        System.out.println("Decide Today Menu By Chef");
    }
}
