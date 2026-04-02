public class WorkoutValidator {
    public static void validatorPositive(double value, String lableKey) {
        if (value < 0) {

            String fieldName = LanguageManager.get(lableKey);
            String errorMsg = LanguageManager.get("error.negative");
            throw new IllegalArgumentException(fieldName + ": " + errorMsg);
        }
    }
}
