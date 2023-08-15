package observer;

import observable.StocksObservable;

public class EmailNotificationObser implements NotificationObserver{

    StocksObservable stocksObservable;
    String emailID;
    public EmailNotificationObser(String emailID, StocksObservable stock){
        this.emailID = emailID;
        this.stocksObservable = stock;
    }

    @Override
    public void update(){
        System.out.println(emailID + ": Hurry stock is available");
    }


}
