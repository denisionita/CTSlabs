package Factory;

public class Main {
    public static void main(String[] args){
        NotifcationFactory factory = new NotifcationFactory();
        Notification pushNotification = factory.createNotification("push");
        pushNotification.notifyUser();
    }
}
