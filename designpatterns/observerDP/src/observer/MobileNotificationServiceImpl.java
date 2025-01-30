package observer;

import obserbale.ProductObservable;

public class MobileNotificationServiceImpl implements NotificationObserver{

    String mobileNo;
    ProductObservable productObservable;

    public MobileNotificationServiceImpl(String mobileNo, ProductObservable productObservable){
        this.productObservable = productObservable;
        this.mobileNo = mobileNo;
    }

    @Override
    public void update() {
        sendMessage("Message sent to ",this.productObservable.getData());
    }

    private void sendMessage(String message,int stockCount){
        System.out.println(message+" "+mobileNo+", Only stock left "+stockCount);
    }
}
