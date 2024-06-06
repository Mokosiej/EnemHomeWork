public enum UserType {
    USER("Пользователь"),
    ADMIN("Администратор");

    private String roleName;

    UserType(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }
}

