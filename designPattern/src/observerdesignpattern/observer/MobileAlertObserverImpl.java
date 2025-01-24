package observerdesignpattern.observer;

import observerdesignpattern.observable.StockObservable;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class MobileAlertObserverImpl implements NotificationAlertObserver {

    String userName;
    StockObservable stockObservable;
    String message = "Product is in Stock Hurry Up..!!!";


    public MobileAlertObserverImpl(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, message);
    }

    private void sendMessageOnMobile(String userName, String message) {
        System.out.println("UserName is : " + userName + "  Message is : " + message);
    }

    @Override
    public String toString() {
        return "MobileAlertObserverImpl{" +
                "userName='" + userName + '\'' +
                ", stockObservable=" + stockObservable +
                ", message='" + message + '\'' +
                '}';
    }

}
