package observer;

import observable.StocksObservable;

public class MessageNotificationObser implements NotificationObserver{
    StocksObservable stocksObservable;
    String mobileNo;
    public MessageNotificationObser(String mobileNo, StocksObservable stock){
        this.mobileNo = mobileNo;
        this.stocksObservable = stock;
    }

    @Override
    public void update(){
        System.out.println(mobileNo + ": Hurry stock is available");
    }
}
