package Set;

import Formatter.TimeFormatter;
import Formatter.WordFormatter;

public class RepsWeightTimeSet extends AbstractSet {
    private int repetitions;
    private double weight;
    private int durationSeconds;

    public RepsWeightTimeSet(int repetitions, double weight, int durationSeconds, int restSeconds) {
        super(restSeconds);
        this.repetitions = repetitions;
        this.weight = weight;
        this.durationSeconds = durationSeconds;
    }

    public int getRepetitions() { return repetitions; }
    public double getWeight() { return weight; }
    public int getDurationSeconds() { return durationSeconds; }

    @Override
    public String toString() {
        return WordFormatter.formatRepetitions(repetitions) + ", " + weight + " kg, time " + TimeFormatter.formatTime(durationSeconds) + ", rest " + TimeFormatter.formatTime(restSeconds);
    }
}