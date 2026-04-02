public class WeightFormatter {
    public static String format(double kg) {
        if (UnitConfig.isMetric()) {
            return String.format("%.1f kg", kg);
        } else {
            return String.format("%.1f lb", kg * 2.20462);
        }
    }
}
