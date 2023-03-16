package behavioral.observer;

import behavioral.observer.event.EmailNotificationListener;
import behavioral.observer.event.EventManager;
import behavioral.observer.event.EventType;
import behavioral.observer.event.SmsNotificationListener;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String email = "email@email.com";
        String phoneNumber = "975573";

        EventManager eventManager = new EventManager(List.of(
                EventType.DOWNLOAD_STARTED,
                EventType.DOWNLOAD_FINISHED));
        EmailNotificationListener emailNotificationListener = new EmailNotificationListener(email);
        SmsNotificationListener smsNotificationListener = new SmsNotificationListener(phoneNumber);
        eventManager.subscribe(EventType.DOWNLOAD_STARTED, emailNotificationListener);
        eventManager.subscribe(EventType.DOWNLOAD_FINISHED, emailNotificationListener);
        eventManager.subscribe(EventType.DOWNLOAD_STARTED, smsNotificationListener);
        eventManager.subscribe(EventType.DOWNLOAD_FINISHED, smsNotificationListener);

        DownloadManager downloadManager = new DownloadManager(eventManager);
        String file = "file.txt";
        downloadManager.startDownload(file);
        downloadManager.finishDownload(file);

        eventManager.unsubscribe(EventType.DOWNLOAD_STARTED, smsNotificationListener);
        eventManager.unsubscribe(EventType.DOWNLOAD_FINISHED, smsNotificationListener);
        downloadManager.startDownload(file);
        downloadManager.finishDownload(file);
    }

}
