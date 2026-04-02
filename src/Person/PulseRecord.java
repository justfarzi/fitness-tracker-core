package Person;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PulseRecord {
    private LocalDateTime timestamp;
    private int pulse;

    // Конструктор
    public PulseRecord(LocalDateTime timestamp, int pulse) {
        this.timestamp = timestamp;
        this.pulse = pulse;
    }

    // Геттеры
    public LocalDateTime getTimestamp() { return timestamp; }
    public int getPulse() { return pulse; }

    // Сеттеры
    public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
    public void setPulse(int pulse) { this.pulse = pulse; }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        return "Пульс: " + pulse + " уд/мин, время: " + timestamp.format(formatter);
    }
}
