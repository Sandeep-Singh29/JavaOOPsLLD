package interfaceImpl;

public class CreditCardPaymentService implements PaymentService {

    @Override
    public void paymentMethod() {
        System.out.println("Payment Successfully By Credit Card Transaction");
    }
}
