package CreationalPatterns.FactoryPattern.Notifications;

import CreationalPatterns.FactoryPattern.Notify.Notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("SMS Notification");
    }
}
