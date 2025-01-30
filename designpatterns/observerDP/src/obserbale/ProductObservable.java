package obserbale;

import observer.NotificationObserver;

public interface ProductObservable {
    void addObserver(NotificationObserver o);
    void removeObserver(NotificationObserver o);
    void notifyObservers();
    void setData(int data);
    int getData();
}
