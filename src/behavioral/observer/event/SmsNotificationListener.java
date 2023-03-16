package behavioral.observer.event;

public class SmsNotificationListener implements EventListener {

    private final String phoneNumber;

    public SmsNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(EventType eventType, String message) {
        System.out.println("SMS to: " + phoneNumber + " Action: " + eventType + " Message: " + message);
    }

}
