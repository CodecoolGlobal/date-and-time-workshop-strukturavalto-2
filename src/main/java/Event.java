import java.time.LocalDateTime;

public class Event {
    private String name;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public Event(String name, LocalDateTime startTime, LocalDateTime endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }
}
