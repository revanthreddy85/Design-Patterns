package CreationalPatterns.FactoryPattern.Factory;

import CreationalPatterns.FactoryPattern.Notifications.CallNotification;
import CreationalPatterns.FactoryPattern.Notifications.EmailNotification;
import CreationalPatterns.FactoryPattern.Notifications.SMSNotification;
import CreationalPatterns.FactoryPattern.Notify.Notification;

public class NotificationFactory {

    public Notification createNotification(String service){
        switch(service) {
            case "SMS" :
                return new SMSNotification();
            case "MAIL" :
                return new EmailNotification();
            case "CALL" :
                return new CallNotification();
            default :
                return null;
        }
    }
}
