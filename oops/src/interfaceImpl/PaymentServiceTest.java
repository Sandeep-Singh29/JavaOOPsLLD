package interfaceImpl;

public class PaymentServiceTest {

    public static void main(String[] args) {

        PaymentService upi = new UpiPaymentService();
        upi.paymentMethod();
        PaymentService cc = new CreditCardPaymentService();
        cc.paymentMethod();


        System.out.println("------Payment Process Using Default------");
        upi.paymentProcess(" UPI");
        cc.paymentProcess(" Credit-Card");

        System.out.println("------Payment APP NAME------");
        PaymentService.appName();
        PaymentService.appName1();


    }

}
