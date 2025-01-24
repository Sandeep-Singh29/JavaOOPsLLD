package observerdesignpattern.observable;

import observerdesignpattern.observer.NotificationAlertObserver;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public interface StockObservable {


    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifyMe();

    void setStockCount(int newStockAdded);

    int getStockCount();

    void observerDetails();


}
