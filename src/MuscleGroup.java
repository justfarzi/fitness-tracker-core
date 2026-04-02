public enum MuscleGroup {
    CHEST("muscle.chest"),     // Грудь
    BACK("muscle.back"),       // Спина
    LEGS("muscle.legs"),       // Ноги
    ARMS("muscle.arms"),       // Руки
    SHOULDERS("muscle.shoulders"),// Плечи
    ALL ("muscle.all");// Все мышцы

    private String translationKey;
    MuscleGroup(String key) { this.translationKey = key; }
    public String getTranslationKey() { return translationKey; }
}