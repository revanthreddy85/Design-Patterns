package CreationalPatterns.FactoryPattern.Notifications;

import CreationalPatterns.FactoryPattern.Notify.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Email Notification");
    }
}
