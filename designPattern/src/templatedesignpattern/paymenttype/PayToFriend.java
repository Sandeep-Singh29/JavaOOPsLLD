package templatedesignpattern.paymenttype;

import templatedesignpattern.templateflow.PaymentFlow;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class PayToFriend extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validate Logic of PayToFriend");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% Fees Charges");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the Amount logic of PayToFriend");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the Full Amount");
    }
}
