class UsernameValidator {
    public static boolean isValid(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }
    public static void main(String[] args) {
        System.out.println(isValid("User_123"));
    }
}