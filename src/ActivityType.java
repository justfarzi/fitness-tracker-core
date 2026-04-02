public enum ActivityType {
    // Теперь каждый тип хранит свой "билет" (ключ) прямо в себе!
    STRENGTH("type.strength"),
    CARDIO("type.cardio"),
    YOGA("type.yoga");

    private String translationKey;

    // Конструктор
    ActivityType(String key) { this.translationKey = key; }

    // Геттер ключа
    public String getTranslationKey() { return translationKey; } 
}