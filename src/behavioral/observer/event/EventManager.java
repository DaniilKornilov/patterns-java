package behavioral.observer.event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {

    Map<EventType, List<EventListener>> eventTypeToListeners = new HashMap<>();

    public EventManager(List<EventType> eventTypes) {
        eventTypes.forEach(eventType -> eventTypeToListeners.put(eventType, new ArrayList<>()));
    }

    public void subscribe(EventType eventType, EventListener listener) {
        List<EventListener> listeners = eventTypeToListeners.get(eventType);
        listeners.add(listener);
    }

    public void unsubscribe(EventType eventType, EventListener listener) {
        List<EventListener> listeners = eventTypeToListeners.get(eventType);
        listeners.remove(listener);
    }

    public void notify(EventType eventType, String message) {
        List<EventListener> listeners = eventTypeToListeners.get(eventType);
        listeners.forEach(listener -> listener.update(eventType, message));
    }

}
