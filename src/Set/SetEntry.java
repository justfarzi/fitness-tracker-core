package Set;

public interface SetEntry {
    String toString();

    default String kind() {
        return "SET";
    }
}
