package Set;

import Formatter.TimeFormatter;
import Formatter.WordFormatter;

public class RepsWeightSet extends AbstractSet {
    private int repetitions;
    private double weight;

    public RepsWeightSet(int repetitions, double weight, int restSeconds) {
        super(restSeconds);
        this.repetitions = repetitions;
        this.weight = weight;
    }

    public int getRepetitions() { return repetitions; }
    public double getWeight() { return weight; }

    @Override
    public String toString() {
        return WordFormatter.formatRepetitions(repetitions) + ", " + weight + " kg, rest " + TimeFormatter.formatTime(restSeconds);
    }
}
