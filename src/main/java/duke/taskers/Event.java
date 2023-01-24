package duke.taskers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {

    private final LocalDateTime start;
    private final LocalDateTime end;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("d MMM uuuu h.mma");


    public Event(String desc, boolean isDone, LocalDateTime start, LocalDateTime end) {
        super(desc, isDone);
        this.start = start;
        this.end = end;
    }

    public String statusStringForFile() {
        return String.format("EVENT / %s / %s / %s", super.stringFormatForFile(), this.start.format(FORMATTER), this.end.format(FORMATTER));
    }

    /**
     * returns the string of the event
     * @return the string of  the event
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + this.start.format(FORMATTER) + " to: " + this.end.format(FORMATTER) + ")";
    }
}
