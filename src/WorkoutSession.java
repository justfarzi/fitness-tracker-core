import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class WorkoutSession {
    // 1. ПОЛЯ (Характеристики тренировки)
    private LocalDateTime dateTime;    // Дата и время начала
    private String note;               // Твой комментарий ("Чувствовал прилив сил!")

    // Самое важное: Список записей о выполненных упражнениях
    // (Пока оставим это как концепт, скоро создадим для этого отдельный класс)
    // private List<ExerciseRecord> records = new ArrayList<>();

    // 2. КОНСТРУКТОР
    public WorkoutSession(LocalDateTime dateTime, String note) {
        this.dateTime = dateTime;
        this.note = note;
    }

    // 3. ГЕТТЕРЫ (Чтобы потом выводить историю на экран)
    public LocalDateTime getDateTime() { return dateTime; }
    public String getNote() { return note; }
}
