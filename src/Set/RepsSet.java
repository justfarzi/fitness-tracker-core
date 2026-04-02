package Set;

import Formatter.TimeFormatter;
import Formatter.WordFormatter;

public class RepsSet extends AbstractSet {
    private int repetitions;

    public RepsSet(int repetitions, int restSeconds) {
        super(restSeconds);
        this.repetitions = repetitions;
    }

    public int getRepetitions() { return repetitions; }

    @Override
    public String toString() {
        return WordFormatter.formatRepetitions(repetitions) + ", rest " + TimeFormatter.formatTime(restSeconds);
    }
}
