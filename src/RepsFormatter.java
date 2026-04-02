public class RepsFormatter {
    private static boolean SHOW_REPS_WORD = true;

    public static void setShowRepsWord(boolean show) { SHOW_REPS_WORD = show;
    }

    public static String format(int reps) {
        if (SHOW_REPS_WORD) {
            return (reps == 1) ? "1 rep" : reps + "reps";
        } else {
            return String.valueOf(reps);
        }
    }
}
