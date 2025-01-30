import obserbale.IphoneObservableImpl;
import obserbale.MacObservableImpl;
import obserbale.ProductObservable;
import observer.EmailNotificationServiceImpl;
import observer.MobileNotificationServiceImpl;
import observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {

        ProductObservable productObservable = new IphoneObservableImpl();
        ProductObservable productObservable2 = new MacObservableImpl();

        NotificationObserver observer = new EmailNotificationServiceImpl("abc@gmail.com",productObservable);
        NotificationObserver observer2 = new EmailNotificationServiceImpl("xyz@gmail.com",productObservable);
        NotificationObserver observer3 = new MobileNotificationServiceImpl("9100910682",productObservable);

        NotificationObserver observer4 = new MobileNotificationServiceImpl("8106810205",productObservable2);
        NotificationObserver observer5 = new EmailNotificationServiceImpl("axegmail.com",productObservable2);

        productObservable.addObserver(observer);
        productObservable.addObserver(observer2);
        productObservable.addObserver(observer3);

        productObservable2.addObserver(observer4);
        productObservable2.addObserver(observer5);

        productObservable.setData(8);
        productObservable2.setData(5);
    }
}
