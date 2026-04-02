import Set.SetEntry;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ExerciseRecord {
    // ВМЕСТО КЛЮЧА И ТИПА — ССЫЛКА НА ЦЕЛЫЙ ОБЪЕКТ
    private ExerciseDefinition definition;
    private List<SetEntry> sets;
    private LocalDateTime dateTime;

    // Конструктор теперь принимает готовую "карточку" из Библиотеки
    public ExerciseRecord(ExerciseDefinition definition) {
        this.definition = definition; // Мы просто запомнили ссылку
        this.sets = new ArrayList<>();
        this.dateTime = LocalDateTime.now();
    }

    // Тот самый метод, который делает класс "живым"
    public void addSet(SetEntry set) {
        this.sets.add(set);
    }

    // Геттеры стали умнее
    public String getDisplayName() {
        // Запись спрашивает у карточки: "Как тебя зовут на текущем языке?"
        return definition.getDisplayKeyOrName();
    }

    public ActivityType getActivityType() {
        // Запись спрашивает у карточки: "Какой ты категории?"
        return definition.getActivityType();
    }

    // ... остальной код (sets, dateTime) остается прежним ...

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        // Используем наш умный геттер для заголовка
        sb.append("--- ").append(getDisplayName()).append(" ---\n");

        sb.append(LanguageManager.get("ui.date")).append(": ")
                .append(dateTime.toString()).append("\n");

        for (int i = 0; i < sets.size(); i++) {
            sb.append(LanguageManager.get("ui.set_number"))
                    .append(i + 1).append(": ")
                    .append(sets.get(i).toString()).append("\n");
        }
        return sb.toString();
    }
}