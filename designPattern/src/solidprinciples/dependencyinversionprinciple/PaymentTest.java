package solidprinciples.dependencyinversionprinciple;

import solidprinciples.dependencyinversionprinciple.service.PaymentService;

/**
 * Author: Sandeep Singh
 * Date: 23/01/25
 */

public class PaymentTest {

    public static void main(String[] args) {

        PaymentService paymentService = new PayPalPaymentService();
        OrderService orderService = new OrderService(paymentService);

        orderService.processOrder(200.00);

        paymentService = new CreditCardPaymentService();
        orderService = new OrderService(paymentService);

        orderService.processOrder(150.00);
    }

}
