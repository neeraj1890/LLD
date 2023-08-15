package observable;

import observer.NotificationObserver;


public interface StocksObservable {
    void add(NotificationObserver observer);

    void remove(NotificationObserver observer);

    void notifySubs();

    void setData(int newData);

    int getData();
}
