package Person;

import java.time.LocalDate;

public class WeightRecord {
    private LocalDate date;   // дата записи
    private double weight;    // вес (кг)

    // Конструктор
    public WeightRecord(LocalDate date, double weight) {
        this.date = date;
        this.weight = weight;
    }

    // Геттеры
    public LocalDate getDate() { return date; }
    public double getWeight() { return weight; }

    // Сеттеры
    public void setDate(LocalDate date) { this.date = date; }
    public void setWeight(double weight) { this.weight = weight; }
}

