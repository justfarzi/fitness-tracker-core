public enum BodyPart {
    UPPER_BODY("body.upper"), // Верх
    LOWER_BODY("body.lower"), // Низ
    FULL_BODY("body.full"),   // Весь корпус
    CORE("body.core");         // Пресс и поясница

    private String translationKey;
    BodyPart(String key) { this.translationKey = key; }
    public String getTranslationKey() { return translationKey; }
}