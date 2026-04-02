package Person;

import java.time.LocalDate;

public class CaloriesRecord {
    private LocalDate date;   // дата записи
    private int calories;     // количество калорий (ккал)

    // Конструктор
    public CaloriesRecord(LocalDate date, int calories) {
        this.date = date;
        this.calories = calories;
    }

    // Геттеры
    public LocalDate getDate() { return date; }
    public int getCalories() { return calories; }

    // Сеттеры
    public void setDate(LocalDate date) { this.date = date; }
    public void setCalories(int calories) { this.calories = calories; }
}
