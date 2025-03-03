package PlacementPractice.CommonQuestions;

interface Notification {
    void sendNotification();
}

class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Email Notification");
    }
}

class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("SMS Notification");
    }
}

class NotificationFactory {
    static Notification createNotification(String type) {
        if (type.equals("Email"))
            return new EmailNotification();
        if (type.equals("SMS"))
            return new SMSNotification();
        return null;
    }
}

public class FactoryPattern {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("Email");
        notification.sendNotification();
    }
}