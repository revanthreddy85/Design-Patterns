package CreationalPatterns.FactoryPattern.Notifications;

import CreationalPatterns.FactoryPattern.Notify.Notification;

public class CallNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Call Notification");
    }
}
