package designpattern.observerDesignPattern.observable;

import designpattern.observerDesignPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
	
	public void add(NotificationAlertObserver observer);
	public void remove(NotificationAlertObserver observer);
	public void notifySubscriber();
	public void setStockCount(int newStocketadded);
	public int getStockCount();

}
