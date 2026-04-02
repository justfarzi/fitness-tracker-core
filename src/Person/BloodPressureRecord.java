package Person;

import java.time.LocalDateTime;

public class BloodPressureRecord {
    private LocalDateTime dateTime;  // время записи
    private int systolic;            // верхнее давление (мм рт. ст.)
    private int diastolic;           // нижнее давление (мм рт. ст.)

    // Конструктор
    public BloodPressureRecord(LocalDateTime dateTime, int systolic, int diastolic) {
        this.dateTime = dateTime;
        this.systolic = systolic;
        this.diastolic = diastolic;
    }

    // Геттеры
    public LocalDateTime getDateTime() { return dateTime; }
    public int getSystolic() { return systolic; }
    public int getDiastolic() { return diastolic; }

    // Сеттеры
    public void setDateTime(LocalDateTime dateTime) { this.dateTime = dateTime; }
    public void setSystolic(int systolic) { this.systolic = systolic; }
    public void setDiastolic(int diastolic) { this.diastolic = diastolic; }
}
