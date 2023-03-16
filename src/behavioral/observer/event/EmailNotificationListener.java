package behavioral.observer.event;

public class EmailNotificationListener implements EventListener {

    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(EventType eventType, String message) {
        System.out.println("Email to: " + email + " Action: " + eventType + " Message: " + message);
    }

}
