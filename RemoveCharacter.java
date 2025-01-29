public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char charToRemove = 'l';
        String result = input.replaceAll(String.valueOf(charToRemove), "");
        
        System.out.println("Modified String: " + result);
    }
}
