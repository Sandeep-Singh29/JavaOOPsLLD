package templatedesignpattern.templateflow;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public abstract class PaymentFlow {

    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();

    // This is Template method  : Which define the order of steps to execute the task
    public final void sendMoney(){

        //Step 1
        validateRequest();

        //Step 2
        debitAmount();

        //Step 3
        calculateFees();

        //Step 4
        creditAmount();



    }


}
