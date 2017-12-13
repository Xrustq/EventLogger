package rusmlg.eventLogger;

import rusmlg.Other.Event;

public class ConsoleEventLogger implements EventLogger {
    private String message;

    public ConsoleEventLogger() {
        this.message = message;
    }

    public void logEvent(Event event) {
        System.out.println(event.toString());
    }
}

