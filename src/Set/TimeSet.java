package Set;

import Formatter.TimeFormatter;

public class TimeSet extends AbstractSet {
    private int durationSeconds;

    public TimeSet(int durationSeconds, int restSeconds) {
        super(restSeconds);
        this.durationSeconds = durationSeconds;
    }

    public int getDurationSeconds() { return durationSeconds; }

    @Override
    public String toString() {
        return "time " + TimeFormatter.formatTime(durationSeconds) + ", rest " + TimeFormatter.formatTime(restSeconds);
    }
}
