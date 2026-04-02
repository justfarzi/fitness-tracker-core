package Set;

import Formatter.TimeFormatter;
import Formatter.WordFormatter;

public class RepsTimeSet extends AbstractSet {
    private int repetitions;
    private int durationSeconds;

    public RepsTimeSet(int repetitions, int durationSeconds, int restSeconds) {
        super(restSeconds);
        this.repetitions = repetitions;
        this.durationSeconds = durationSeconds;
    }

    public int getRepetitions() { return repetitions; }
    public int getDurationSeconds() { return durationSeconds; }

    @Override
    public String toString() {
        return WordFormatter.formatRepetitions(repetitions) +
                ", time " + TimeFormatter.formatTime(durationSeconds) +
                ", rest " + TimeFormatter.formatTime(restSeconds);
    }

}
