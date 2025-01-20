package interfaceImpl;

public class UpiPaymentService implements PaymentService{

    @Override
    public void paymentMethod() {
        System.out.println("Payment Successfully By UPI Transaction");
    }
}
