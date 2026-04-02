package Set;

// Мы помечаем его как abstract, чтобы нельзя было создать просто "Абстрактный сет".
// Он существует только как основа для других.
public abstract class AbstractSet implements SetEntry {

    protected int restSeconds; // Доступно только детям этого класса

    public AbstractSet(int restSeconds) {
        this.restSeconds = restSeconds;
    }

    public int getRestSeconds() {
        return restSeconds;
    }

    // Сюда же можно вынести общую логику для всех сетов в будущем
}