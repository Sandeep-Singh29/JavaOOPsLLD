package observerdesignpattern.observable;

import observerdesignpattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Sandeep Singh
 * Date: 24/01/25
 */

public class SamsungObservableImpl implements StockObservable {

    List<NotificationAlertObserver> observerList = new ArrayList<>();

    int stockCount = 0;


    @Override
    public void observerDetails() {
        observerList.forEach(System.out::println);
    }

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyMe() {
        observerList.forEach(NotificationAlertObserver::update);
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (stockCount == 0) {
            notifyMe();
        }
        stockCount += newStockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
