package solidprinciples.dependencyinversionprinciple;

import solidprinciples.dependencyinversionprinciple.service.PaymentService;

/**
 * Author: Sandeep Singh
 * Date: 23/01/25
 */


public class OrderService {
    private  final PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processOrder(double amount) {
        paymentService.processPayment(amount);  // Delegate payment processing
    }
}
