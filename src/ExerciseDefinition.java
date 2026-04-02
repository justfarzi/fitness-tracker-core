import java.util.ArrayList;
import java.util.List;

public class ExerciseDefinition {
    // 1. ПОЛЯ (Характеристики ячейки)
    private String keyOrName;        // Ключ ("ex.bench_press") или прямой текст
    private ActivityType activityType;   // Тип активити (STRENGTH, CARDIO)
    private BodyPart bodyPart;
    private MuscleGroup muscleGroup;
    private boolean isUserCreated;    // Переключатель: true - ввел юзер, false - системный текст

    // 2. КОНСТРУКТОР
    public ExerciseDefinition(String keyOrName,
                              ActivityType activityType,
                              BodyPart bodyPart,
                              MuscleGroup muscleGroup,
                              boolean isUserCreated) {
        this.keyOrName = keyOrName;
        this.activityType = activityType;
        this.bodyPart = bodyPart;
        this.muscleGroup = muscleGroup;
        this.isUserCreated = isUserCreated;
    }

    // 3. ГЕТТЕР №1 - Нужен, чтобы вывести название на экран (в список упражнений).
    public String getDisplayKeyOrName() {
        if (isUserCreated) {
            // Если юзер сам написал "Мой супер-жим", отдаем как есть
            return keyOrName;
        } else {
            // Если это системный ключ ("ex.bench_press"), то программа идет в LanguageManager для перевода
            return LanguageManager.get(keyOrName);
        }
    }

    // ГЕТТЕР №2A - Нужен, чтобы программа могла группировать упражнения (например, отделить «Силовые» от «Кардио»).
    // Этот геттер для логики (компьютера).
    // Его лучше оставить как есть — пусть он возвращает «чистый» тип данных (Enum), чтобы компьютер мог быстро сравнивать их.
    public ActivityType getActivityType() {return activityType;}
    public BodyPart getBodyPart() {return bodyPart;}
    public MuscleGroup getMuscleGroup() {return muscleGroup;}

    //ГЕТТЕР №2B - для экрана («переводчик»).
    public String getDisplayActivityType() {
        // Больше никаких if/else!
        // Мы просто берем ключ у типа и отдаем его переводчику.
        return LanguageManager.get(activityType.getTranslationKey());
    }

    public String getDisplayBodyPart() {
        return LanguageManager.get(bodyPart.getTranslationKey());
    }

    public String getDisplayMuscleGroup() {
        return LanguageManager.get(muscleGroup.getTranslationKey());
    }
}