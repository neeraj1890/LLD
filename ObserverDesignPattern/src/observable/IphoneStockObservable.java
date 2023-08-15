package observable;

import observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StocksObservable{

    List<NotificationObserver> notificationObserverList = new ArrayList<>();
    int data;

    @Override
    public void add(NotificationObserver observer){
        notificationObserverList.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer){
        notificationObserverList.remove(observer);
    }

    @Override
    public void notifySubs(){
        for(NotificationObserver notificationObserver : notificationObserverList){
            notificationObserver.update();
        }
    }

    @Override
    public void setData(int newData){
        if(data == 0){
            notifySubs();
        }
        data = newData;
    }

    @Override
    public int getData(){
        return data;
    }
}
