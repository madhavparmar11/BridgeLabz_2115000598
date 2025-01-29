public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        String oldWord = "fox";
        String newWord = "cat";
        
        String result = sentence.replace(oldWord, newWord);
        System.out.println("Updated Sentence: " + result);
    }
}
