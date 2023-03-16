package behavioral.observer;

import behavioral.observer.event.EventManager;
import behavioral.observer.event.EventType;

public class DownloadManager {

    private final EventManager eventManager;

    public DownloadManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void startDownload(String file) {
        String message = "Started file downloading: " + file;
        eventManager.notify(EventType.DOWNLOAD_STARTED, message);
    }

    public void finishDownload(String file) {
        String message = "Finish file downloading: " + file;
        eventManager.notify(EventType.DOWNLOAD_FINISHED, message);
    }

}
