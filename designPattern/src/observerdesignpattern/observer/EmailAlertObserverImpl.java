package observerdesignpattern.observer;

import observerdesignpattern.observable.StockObservable;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String emailId;
    StockObservable stockObservable;
    String message = "Product is in Stock Hurry Up..!!!";

    public EmailAlertObserverImpl(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }


    @Override
    public void update() {
        sendMail(emailId, message);
    }


    private void sendMail(String emailId, String message) {
        this.message = message;
        System.out.println("Mail Send to :: " + emailId + " Message is :: " + message);
    }

    @Override
    public String toString() {
        return "EmailAlertObserverImpl{" +
                "emailId='" + emailId + '\'' +
                ", stockObservable=" + stockObservable +
                ", message='" + message + '\'' +
                '}';
    }

}
