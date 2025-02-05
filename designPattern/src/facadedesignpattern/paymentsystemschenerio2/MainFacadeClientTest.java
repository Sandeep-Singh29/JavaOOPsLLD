package facadedesignpattern.paymentsystemschenerio2;

import facadedesignpattern.paymentsystemschenerio2.facade.OrderFacade;

/**
 * Author: Sandeep Singh
 * Date: 05/02/25
 */

public class MainFacadeClientTest {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.createOrder();
    }
}
