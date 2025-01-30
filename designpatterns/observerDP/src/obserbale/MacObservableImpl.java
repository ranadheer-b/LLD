package obserbale;

import observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class MacObservableImpl implements ProductObservable {

    int data = 0;
    List<NotificationObserver> observers = new ArrayList<NotificationObserver>();

    @Override
    public void addObserver(NotificationObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(NotificationObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(NotificationObserver o : observers) {
            o.update();
        }
    }

    @Override
    public void setData(int data) {
        this.data+=data;
            if(this.data<10){
                notifyObservers();
            }
    }

    @Override
    public int getData() {
        return this.data;
    }
}
