package templatedesignpattern;

import templatedesignpattern.paymenttype.PayToFriend;
import templatedesignpattern.paymenttype.PayToMerchant;
import templatedesignpattern.templateflow.PaymentFlow;

/**
 * Author: Sandeep Singh
 * Date: 12/02/25
 */

public class TemplateMainTest {
    public static void main(String[] args) {
        System.out.println("------PayToFriend------");
        PaymentFlow payToFriend = new PayToFriend();
        payToFriend.sendMoney();
        System.out.println("------PayToMerchant------");
        PaymentFlow payToMerchant = new PayToMerchant();
        payToMerchant.sendMoney();
    }
}
