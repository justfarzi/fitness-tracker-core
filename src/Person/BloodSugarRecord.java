package Person;

import java.time.LocalDateTime;

public class BloodSugarRecord {
    private LocalDateTime dateTime;  // время записи
    private double sugarLevel;       // уровень сахара (ммоль/л)

    // Конструктор
    public BloodSugarRecord(LocalDateTime dateTime, double sugarLevel) {
        this.dateTime = dateTime;
        this.sugarLevel = sugarLevel;
    }

    // Геттеры
    public LocalDateTime getDateTime() { return dateTime; }
    public double getSugarLevel() { return sugarLevel; }

    // Сеттеры
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public void setSugarLevel(double sugarLevel) { this.sugarLevel = sugarLevel; }
}
