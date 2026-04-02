package Formatter;

public class WordFormatter {
    public static String formatRepetitions(int repetitions) {
        return repetitions + " " + (repetitions == 1 ? "rep" : "reps");
    }
}
