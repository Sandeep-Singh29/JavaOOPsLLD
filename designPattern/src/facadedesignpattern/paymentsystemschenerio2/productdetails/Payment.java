package facadedesignpattern.paymentsystemschenerio2.productdetails;

/**
 * Author: Sandeep Singh
 * Date: 05/02/25
 */

public class Payment {

    public boolean makePayment() {
        return true;
    }

    public void checkPayment() {
        boolean b = makePayment();
        if (b) {
            System.out.println("Payment Successfully..!!");
            return;
        }
        System.out.println("Payment Canceled... Please Try Again");
    }

}
