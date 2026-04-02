package Person;

import java.time.LocalDate;

public class Person {
    // Приватные поля
    private String name;          // имя
    private boolean isMale;       // пол (true = мужчина, false = женщина)
    private LocalDate birthDate;  // дата рождения
    private double height;        // рост (см)

    // Конструктор
    public Person(String name, boolean isMale, LocalDate birthDate, double height) {
        this.name = name;
        this.isMale = isMale;
        this.birthDate = birthDate;
        this.height = height;
    }

    // Геттеры
    public String getName() { return name; }
    public boolean isMale() { return isMale; }
    public LocalDate getBirthDate() { return birthDate; }
    public double getHeight() { return height; }

    // Сеттеры
    public void setName(String name) { this.name = name; }
    public void setMale(boolean isMale) { this.isMale = isMale; }
    public void setBirthDate(LocalDate birthDate) { this.birthDate = birthDate; }
    public void setHeight(double height) { this.height = height; }
}
