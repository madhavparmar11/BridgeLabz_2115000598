import java.util.Scanner;

class TextState {
    char[] text;
    TextState next;
    TextState prev;

    TextState(char[] text) {
        this.text = text;
        this.next = null;
        this.prev = null;
    }
}

class TextEditor {
    TextState head;
    TextState current;
    int size;
    int limit = 10;

    void addState(char[] text) {
        TextState newState = new TextState(text);
        if (this.head == null) {
            this.head = newState;
            this.current = newState;
            this.size = 1;
            return;
        }
        this.current.next = newState;
        newState.prev = this.current;
        this.current = newState;
        this.size++;
        if (this.size > this.limit) {
            this.head = this.head.next;
            this.head.prev = null;
            this.size--;
        }
    }

    void undo() {
        if (this.current != null && this.current.prev != null) {
            this.current = this.current.prev;
        }
    }

    void redo() {
        if (this.current != null && this.current.next != null) {
            this.current = this.current.next;
        }
    }

    void displayCurrentState() {
        if (this.current == null) return;
        int i = 0;
        while (this.current.text[i] != '\0') {
            System.out.print(this.current.text[i]);
            i++;
        }
        System.out.println();
    }
}

public class UndoRedoTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        editor.addState(new char[]{'H', 'e', 'l', 'l', 'o', '\0'});
        editor.addState(new char[]{'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '\0'});
        editor.displayCurrentState();
        editor.undo();
        editor.displayCurrentState();
        editor.redo();
        editor.displayCurrentState();

        scanner.close();
    }
}
