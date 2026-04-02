package Set;

import Formatter.TimeFormatter;

public class DistanceTimeSet extends AbstractSet {
    private double distanceMeters;
    private int durationSeconds;

    public DistanceTimeSet(double distanceMeters, int durationSeconds, int restSeconds) {
        super(restSeconds);
        this.distanceMeters = distanceMeters;
        this.durationSeconds = durationSeconds;
    }

    public double getDistanceMeters() { return distanceMeters; }
    public int getDurationSeconds() { return durationSeconds; }

    @Override
    public String toString() {
        return distanceMeters + " m, time " + TimeFormatter.formatTime(durationSeconds) + ", rest " + TimeFormatter.formatTime(restSeconds);
    }
}
