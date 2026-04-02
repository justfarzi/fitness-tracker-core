import java.util.ArrayList;
import java.util.List;

public class ExerciseRepository {
    // 1. ХРАНИЛИЩЕ: Один список для всего (и системных, и твоих)
    private static final List<ExerciseDefinition> allExercises = new ArrayList<>();

    // 2. ИНИЦИАЛИЗАЦИЯ: Наполняем базу при старте
    static {
        allExercises.add(new ExerciseDefinition("ex.bench_press", ActivityType.STRENGTH, BodyPart.UPPER_BODY, MuscleGroup.CHEST, false));
        allExercises.add(new ExerciseDefinition("ex.squats", ActivityType.STRENGTH, BodyPart.LOWER_BODY, MuscleGroup.LEGS, false));
        allExercises.add(new ExerciseDefinition("ex.running", ActivityType.CARDIO, BodyPart.FULL_BODY, MuscleGroup.ALL, false));
    }

    // 3. МЕТОД: Отдать ВООБЩЕ ВСЁ (для общего списка)
    public static List<ExerciseDefinition> getAll() {
        return allExercises;
    }

    // 4. МЕТОД: Умный фильтр (твое "сито")
    public static List<ExerciseDefinition> getByFilter(BodyPart part, MuscleGroup muscle) {
        List<ExerciseDefinition> filtered = new ArrayList<>();
        for (ExerciseDefinition ex : allExercises) {
            if (ex.getBodyPart() == part && ex.getMuscleGroup() == muscle) {
                filtered.add(ex);
            }
        }
        return filtered;
    }

    // 5. МЕТОД: Добавление своего (расширение базы)
    public static void addCustom(String name, ActivityType type, BodyPart body, MuscleGroup muscle) {
        allExercises.add(new ExerciseDefinition(name, type, body, muscle, true));
    }
}