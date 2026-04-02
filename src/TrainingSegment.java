import java.util.ArrayList;
import java.util.List;

public class TrainingSegment {
    private ActivityType activityType;
    private List<ExerciseRecord> exercises;

    public TrainingSegment(ActivityType activityType) {
        this.activityType = activityType;
        this.exercises = new ArrayList<>();
    }

    public ActivityType getActivityType() { return activityType; }
    public List<ExerciseRecord> getExercises() { return exercises; }

    public void addExercise(ExerciseRecord exercise) {
        if (exercise.getActivityType() == activityType) {
            exercises.add(exercise);
        } else {
            System.out.println("Exercise type does not match segment activity!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Segment (" + activityType + "):\n");
        for (ExerciseRecord ex : exercises) {
            sb.append(ex.toString()).append("\n");
        }
        return sb.toString();
    }
}
