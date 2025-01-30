package observer;

import obserbale.ProductObservable;

public class EmailNotificationServiceImpl implements NotificationObserver{
    String emailId;
    ProductObservable productObservable;

    public EmailNotificationServiceImpl(String emailId, ProductObservable productObservable){
        this.productObservable = productObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(this.productObservable.getData(),"items left in the stock only");
    }

    public void sendMail(int stockCount, String body){
        System.out.println("Hi "+emailId+", "+body+" "+stockCount);
    }
}
