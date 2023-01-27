package duke;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event extends Task {

    private final LocalDateTime start;
    private final LocalDateTime end;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private static final DateTimeFormatter FORMATTER_FOR_STRING_ONLY = DateTimeFormatter.ofPattern("d MMM uuuu h.mma");

    /**
     * duke.Event constructor.
     * @param desc Description of what the event is.
     * @param isDone True if event is done, false if event is not done.
     * @param start Starting date of event.
     * @param end Ending date of event.
     */
    public Event(String desc, boolean isDone,
                 LocalDateTime start, LocalDateTime end) {
        super(desc, isDone);
        this.start = start;
        this.end = end;
    }

    /**
     * Formats string before inserting into duke storage file.
     *
     * @return Formatted string to be inserted into duke storage file.
     */

    public String formatStringForFile() {
        return String.format("EVENT / %s / %s / %s", super.helpFormatString(),
                this.start.format(FORMATTER), this.end.format(FORMATTER));
    }

    /**
     * Returns the string of the event.
     *
     * @return The string of  the event.
     */
    @Override
    public String toString() {
        return "[E]" + super.toString() + " (from: " + this.start.format(FORMATTER_FOR_STRING_ONLY) + " to: " + this.end.format(FORMATTER_FOR_STRING_ONLY) + ")";
    }
}