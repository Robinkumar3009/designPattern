package designpattern.observerDesignPattern.observer;

import designpattern.observerDesignPattern.observable.StocksObservable;

public class EmailAlertObserverImple implements NotificationAlertObserver {

	String emailId;
    StocksObservable observable;
    
    public EmailAlertObserverImple(String emailId,StocksObservable observable)
    {
    	this.emailId=emailId;
    	this.observable=observable;
    }
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("send data to email");
		
	}

}
