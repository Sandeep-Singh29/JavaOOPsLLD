package solidprinciples.dependencyinversionprinciple;

import solidprinciples.dependencyinversionprinciple.service.PaymentService;

/**
 * Author: Sandeep Singh
 * Date: 23/01/25
 */


public class CreditCardPaymentService implements PaymentService {


    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via Credit Card.");
    }
}
