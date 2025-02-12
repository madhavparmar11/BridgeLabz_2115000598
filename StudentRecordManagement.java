import java.util.Scanner;

class Student {
    int rollNumber;
    char[] name;
    int age;
    char grade;
    Student next;

    Student(int rollNumber, char[] name, int age, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.next = null;
    }
}

class StudentList {
    Student head;

    void addStudent(int rollNumber, char[] name, int age, char grade, int position) {
        Student newStudent = new Student(rollNumber, name, age, grade);
        if (position == 0 || head == null) {
            newStudent.next = head;
            head = newStudent;
            return;
        }
        Student temp = head;
        int count = 0;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        newStudent.next = temp.next;
        temp.next = newStudent;
    }

    void deleteStudent(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    Student searchStudent(int rollNumber) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) return temp;
            temp = temp.next;
        }
        return null;
    }

    void displayStudents() {
        Student temp = head;
        while (temp != null) {
            System.out.print(temp.rollNumber + " ");
            int i = 0;
            while (temp.name[i] != '\0') {
                System.out.print(temp.name[i]);
                i++;
            }
            System.out.println(" " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }

    void updateGrade(int rollNumber, char grade) {
        Student student = searchStudent(rollNumber);
        if (student != null) student.grade = grade;
    }
}

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentList list = new StudentList();

        list.addStudent(1, new char[]{'A', 'l', 'i', '\0'}, 20, 'B', 0);
        list.addStudent(2, new char[]{'B', 'o', 'b', '\0'}, 21, 'A', 1);
        list.addStudent(3, new char[]{'C', 'a', 'r', 'l', '\0'}, 19, 'C', 1);
        
        list.displayStudents();
        list.updateGrade(2, 'B');
        list.deleteStudent(1);
        list.displayStudents();
        
        scanner.close();
    }
}