import java.time.LocalDateTime;

public class CardioRecord {
    private LocalDateTime startTime;   // время начала тренировки
    private LocalDateTime endTime;     // время окончания тренировки
    private double distance;           // дистанция (км), если применимо
    private int repetitions;           // количество повторений (например, прыжки на скакалке)
    private String type;               // тип кардио (велосипед, плавание, бег, шаги и т.д.)

    // Конструктор
    public CardioRecord(LocalDateTime startTime, LocalDateTime endTime,
                        double distance, int repetitions, String type) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.distance = distance;
        this.repetitions = repetitions;
        this.type = type;
    }

    // Геттеры
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public double getDistance() { return distance; }
    public int getRepetitions() { return repetitions; }
    public String getType() { return type; }

    // Сеттеры
    public void setStartTime(LocalDateTime startTime) { this.startTime = startTime; }
    public void setEndTime(LocalDateTime endTime) { this.endTime = endTime; }
    public void setDistance(double distance) { this.distance = distance; }
    public void setRepetitions(int repetitions) { this.repetitions = repetitions; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return "CardioRecord{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", distance=" + distance +
                ", repetitions=" + repetitions +
                ", type='" + type + '\'' +
                '}';
    }
}
