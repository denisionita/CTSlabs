package Factory;

public class NotifcationFactory {
    public Notification createNotification(String type) {
        if (type.equalsIgnoreCase("SMS")) {
            return new SMSNotification();
        }
        if (type.equalsIgnoreCase("Email")) {
            return new EmailNotification();
        }
        if (type.equalsIgnoreCase("Push")) {
            return new PushNotification();
        }
        return null;
    }
}
