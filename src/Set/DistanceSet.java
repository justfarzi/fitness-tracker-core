package Set;

import Formatter.TimeFormatter;

public class DistanceSet extends AbstractSet {
    private int distanceMeters;

    public DistanceSet(int distanceMeters, int restSeconds) {
        super(restSeconds);
        this.distanceMeters = distanceMeters;
    }

    public double getDistanceMeters() { return distanceMeters; }

    @Override
    public String toString() {
        return distanceMeters + " m, rest " + TimeFormatter.formatTime(restSeconds);
    }
}
