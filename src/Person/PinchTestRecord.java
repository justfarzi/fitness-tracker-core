package Person;

import java.time.LocalDateTime;

public class PinchTestRecord {
    private LocalDateTime dateTime;  // время записи
    private String location;         // место замера (например: "triceps", "abdomen")
    private double thickness;        // толщина складки (мм)

    // Конструктор
    public PinchTestRecord(LocalDateTime dateTime, String location, double thickness) {
        this.dateTime = dateTime;
        this.location = location;
        this.thickness = thickness;
    }

    // Геттеры
    public LocalDateTime getDateTime() { return dateTime; }
    public String getLocation() { return location; }
    public double getThickness() { return thickness; }

    // Сеттеры
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public void setLocation(String location) { this.location = location; }
    public void setThickness(double thickness) { this.thickness = thickness; }
}
