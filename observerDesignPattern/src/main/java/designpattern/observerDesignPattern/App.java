package designpattern.observerDesignPattern;

import designpattern.observerDesignPattern.observable.IphoneObservableImpl;
import designpattern.observerDesignPattern.observable.StocksObservable;
import designpattern.observerDesignPattern.observer.EmailAlertObserverImple;
import designpattern.observerDesignPattern.observer.NotificationAlertObserver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StocksObservable iphoneObservable=new IphoneObservableImpl();
        System.out.println( "Hello World!" );
        NotificationAlertObserver observable=  new EmailAlertObserverImple("robinrj39@gmail.com",iphoneObservable);
        iphoneObservable.add(observable);
        iphoneObservable.setStockCount(10);
        
    }
}
