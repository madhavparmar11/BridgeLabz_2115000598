import java.util.regex.*;

class IPAddressValidator {
    public static boolean isValid(String ip) {
        return ip.matches("^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$");
    }
    public static void main(String[] args) {
        System.out.println(isValid("192.168.1.1"));
    }
}