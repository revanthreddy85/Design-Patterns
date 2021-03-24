package CreationalPatterns.FactoryPattern.Service;

import CreationalPatterns.FactoryPattern.Factory.NotificationFactory;
import CreationalPatterns.FactoryPattern.Notify.Notification;

public class NotificationService {
    public static void main(String[] args){
        NotificationFactory factory=new NotificationFactory();
        Notification notification = factory.createNotification("SMS");
        notification.notifyUser();
    }
}
