import observable.IphoneStockObservable;
import observable.StocksObservable;
import observer.EmailNotificationObser;
import observer.MessageNotificationObser;

public class Main {
    public static void main(String[] args) {

        StocksObservable stocks = new IphoneStockObservable();

        stocks.add(new EmailNotificationObser("xyz@gmail.com", stocks));
        stocks.add(new EmailNotificationObser("abc@gmail.com", stocks));
        stocks.add(new MessageNotificationObser("678", stocks));

        stocks.setData(10);
        stocks.setData(0);
        stocks.setData(100);
    }
}