import java.util.HashMap;
import java.util.Map;

public class LanguageManager {
    private static Language currentLanguage = Language.EN; // По умолчанию английский

    // Где хранить? (Блок 1 — Ресурс). Наш временный "словарь" (позже мы вынесем это в файлы). (Шкаф) — место хранения.
    private static final Map<String,Map<Language,String>> dictionary = new HashMap<>();

    // Что именно положить? (Блок 3 — Данные).  Заполняем словарь ключами и переводами. (Приказ) — список команд для Робота: «Возьми эти слова и положи в этот Шкаф».
    static {
        addTranslation("error.negative", "Value cannot be negative!", "Значение не может быть отрицательным!");
        addTranslation("error.required", "Field is required!", "Поле обязательно для заполнения!");
        addTranslation("label.weight", "Weight", "Вес");
        addTranslation("label.reps", "Reps", "Повторения");
        addTranslation("unit.kg", "kg", "кг");
        addTranslation("unit.lbs", "lbs", "фунты");
        addTranslation("ui.date", "Date", "Дата");
        addTranslation("ui.set_number", "Set #", "Подход №");
        addTranslation("ex.bench_press", "Bench press", "Жим лёжа");
        addTranslation("ex.squats", "Squats", "Приседания");
        addTranslation("ex.running", "Running", "Бег");
        addTranslation("ex.swimming", "Swimming", "Плавание");
        addTranslation("type.strength", "Strength", "Сила");
        addTranslation("type.cardio", "Cardio", "Кардио");
            }

    // Как упаковать? (Блок 2 — Технология). (Робот) — обученный мастер, который знает, как упаковывать слова в этот шкаф.
    private static void addTranslation(String key, String en, String ru) {
        Map<Language, String> translation = new HashMap<>();
        translation.put(Language.EN, en);
        translation.put(Language.RU, ru);
        dictionary.put(key, translation);
    }

    // Сеттер. Метод для смены языка одной кнопкой
    public static void setLanguage(Language lang) {
        currentLanguage = lang;
    }

    // Геттер #1 Достает перевод по ключу.
    // Например, как в ExerciseDefinition: "return LanguageManager.get(keyOrName)"
    // Где keyOrName - это String ("private String keyOrName;")
    public static String get(String key) {
        if (!dictionary.containsKey(key)) return key;
        return dictionary.get(key).get(currentLanguage);
    }

    public static Language getCurrentLanguage() {
        return currentLanguage;
    }
}
