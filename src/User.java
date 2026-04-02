public class User {
    // Приватные поля
    private final String id;     // уникальный идентификатор
    private String username;     // логин
    private String password;     // пароль
    private String email;        // email

    // Конструктор
    public User(String id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    // Геттеры
    public String getId() { return id; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }

    // Сеттеры
    public void setUsername(String username) { this.username = username; }
    public void setPassword(String password) { this.password = password; }
    public void setEmail(String email) { this.email = email; }
}


