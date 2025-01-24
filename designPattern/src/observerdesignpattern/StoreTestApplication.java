package observerdesignpattern;

import observerdesignpattern.observable.SamsungObservableImpl;
import observerdesignpattern.observable.StockObservable;
import observerdesignpattern.observer.EmailAlertObserverImpl;
import observerdesignpattern.observer.MobileAlertObserverImpl;
import observerdesignpattern.observer.NotificationAlertObserver;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class StoreTestApplication {
    public static void main(String[] args) {

        // Create a Phone Object for Alert message
        StockObservable samsungStock = new SamsungObservableImpl();


        // Notify By different Different Way
        NotificationAlertObserver user1 = new EmailAlertObserverImpl("sandeep@123", samsungStock);
        NotificationAlertObserver user2 = new EmailAlertObserverImpl("kuldeep@123", samsungStock);
        NotificationAlertObserver user3 = new MobileAlertObserverImpl("Sandeep", samsungStock);


        // add user which is notify mobile
        samsungStock.add(user1);
        samsungStock.add(user2);
        samsungStock.add(user3);

        // Add new Stock
        samsungStock.setStockCount(10);
        System.out.println("Total New Stock Is: " + samsungStock.getStockCount());
        samsungStock.observerDetails();

    }
}
