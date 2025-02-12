import java.util.Scanner;

class Task {
    int id;
    char[] name;
    int priority;
    char[] dueDate;
    Task next;

    Task(int id, char[] name, int priority, char[] dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    Task head;

    void addTask(int id, char[] name, int priority, char[] dueDate) {
        Task newTask = new Task(id, name, priority, dueDate);
        if (this.head == null) {
            this.head = newTask;
            newTask.next = newTask;
            return;
        }
        Task temp = this.head;
        while (temp.next != this.head) temp = temp.next;
        temp.next = newTask;
        newTask.next = this.head;
    }

    void removeTask(int id) {
        if (this.head == null) return;
        Task temp = this.head, prev = null;
        do {
            if (temp.id == id) {
                if (temp == this.head && temp.next == this.head) {
                    this.head = null;
                    return;
                }
                if (temp == this.head) {
                    Task last = this.head;
                    while (last.next != this.head) last = last.next;
                    this.head = temp.next;
                    last.next = this.head;
                    return;
                }
                prev.next = temp.next;
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != this.head);
    }

    void viewCurrentTask() {
        if (this.head != null) {
            System.out.print(this.head.id + " ");
            int i = 0;
            while (this.head.name[i] != '\0') System.out.print(this.head.name[i++]);
            System.out.print(" " + this.head.priority + " ");
            i = 0;
            while (this.head.dueDate[i] != '\0') System.out.print(this.head.dueDate[i++]);
            System.out.println();
        }
    }

    void moveToNextTask() {
        if (this.head != null) this.head = this.head.next;
    }

    void displayTasks() {
        if (this.head == null) return;
        Task temp = this.head;
        do {
            System.out.print(temp.id + " ");
            int i = 0;
            while (temp.name[i] != '\0') System.out.print(temp.name[i++]);
            System.out.print(" " + temp.priority + " ");
            i = 0;
            while (temp.dueDate[i] != '\0') System.out.print(temp.dueDate[i++]);
            System.out.println();
            temp = temp.next;
        } while (temp != this.head);
    }

    Task searchTaskByPriority(int priority) {
        if (this.head == null) return null;
        Task temp = this.head;
        do {
            if (temp.priority == priority) return temp;
            temp = temp.next;
        } while (temp != this.head);
        return null;
    }
}

public class TaskManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(1, new char[]{'T', 'a', 's', 'k', '1', '\0'}, 2, new char[]{'0', '1', '/', '0', '2', '/', '2', '0', '2', '5', '\0'});
        scheduler.addTask(2, new char[]{'T', 'a', 's', 'k', '2', '\0'}, 1, new char[]{'0', '3', '/', '0', '2', '/', '2', '0', '2', '5', '\0'});
        scheduler.addTask(3, new char[]{'T', 'a', 's', 'k', '3', '\0'}, 3, new char[]{'0', '5', '/', '0', '2', '/', '2', '0', '2', '5', '\0'});

        scheduler.displayTasks();
        scheduler.viewCurrentTask();
        scheduler.moveToNextTask();
        scheduler.viewCurrentTask();
        scheduler.removeTask(2);
        scheduler.displayTasks();

        scanner.close();
    }
}
