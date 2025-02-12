package templatedesignpattern.paymenttype;

import templatedesignpattern.templateflow.PaymentFlow;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class PayToMerchant extends PaymentFlow {

    @Override
    public void validateRequest() {
        System.out.println("Validate Logic of PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% Fees Charged");
    }

    @Override
    public void debitAmount() {
        System.out.println("Debit the Amount logic of PayToMerchant");
    }

    @Override
    public void creditAmount() {
        System.out.println("Credit the remaining Amount After Fees Deduction");
    }
}
