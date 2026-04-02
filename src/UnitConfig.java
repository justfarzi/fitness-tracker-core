public class UnitConfig {
    private static UnitSystem currentSystem = UnitSystem.METRIC;

    public static void setUnitSystem(UnitSystem system) {
        currentSystem = system;
    }

    public static UnitSystem getUnitSystem() {
        return currentSystem;
    }

    public static boolean isMetric() {
        return currentSystem == UnitSystem.METRIC;
    }

    public static boolean isImperial() {
        return currentSystem == UnitSystem.IMPERIAL;
    }
}
