package designpattern.observerDesignPattern.observable;

import java.util.ArrayList;
import java.util.List;

import designpattern.observerDesignPattern.observer.NotificationAlertObserver;

public class IphoneObservableImpl  implements StocksObservable{
	
	public List<NotificationAlertObserver> observerList=new ArrayList<>();
	
	public int stockCount=0;

	@Override
	public void add(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		// TODO Auto-generated method stub
		observerList.remove(observer);
	}

	@Override
	public void notifySubscriber() {
		// TODO Auto-generated method stub
		
		for (NotificationAlertObserver observer:observerList )
		{
			observer.update();
		}
		
	}

	@Override
	public void setStockCount(int newStocketadded) {
		// TODO Auto-generated method stub
		if(stockCount==0)
		{
			notifySubscriber();
		}
		stockCount=stockCount+newStocketadded;
		
	}

	@Override
	public int getStockCount() {
		// TODO Auto-generated method stub
		return stockCount;
	}

}
