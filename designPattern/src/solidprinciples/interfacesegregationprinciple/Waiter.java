package solidprinciples.interfacesegregationprinciple;

/**
 * Author: Sandeep Singh
 * Date: 23/01/25
 */

public class Waiter implements WaiterInterface {

    @Override
    public void serverCustomers() {
        System.out.println("Food Server to Customers");
    }

    @Override
    public void takeOrders() {
        System.out.println("Take Food Order to Customers");
    }
}
