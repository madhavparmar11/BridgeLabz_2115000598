import java.util.Scanner;

class Employee {
    int id;
    char[] name;
    double salary;
    char[] department;
    Employee next;
    Employee prev;

    Employee(int id, char[] name, double salary, char[] department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.next = null;
        this.prev = null;
    }
}

class Payroll {
    Employee head;
    Employee tail;

    void addEmployee(int id, char[] name, double salary, char[] department) {
        Employee newEmployee = new Employee(id, name, salary, department);
        if (this.head == null) {
            this.head = this.tail = newEmployee;
            return;
        }
        this.tail.next = newEmployee;
        newEmployee.prev = this.tail;
        this.tail = newEmployee;
    }

    void removeEmployee(int id) {
        Employee temp = this.head;
        while (temp != null) {
            if (temp.id == id) {
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                if (temp == this.head) this.head = temp.next;
                if (temp == this.tail) this.tail = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    void updateSalary(int id, double newSalary) {
        Employee temp = this.head;
        while (temp != null) {
            if (temp.id == id) {
                temp.salary = newSalary;
                return;
            }
            temp = temp.next;
        }
    }

    Employee searchByDepartment(char[] department) {
        Employee temp = this.head;
        while (temp != null) {
            int i = 0;
            while (temp.department[i] == department[i] && temp.department[i] != '\0' && department[i] != '\0') i++;
            if (temp.department[i] == '\0' && department[i] == '\0') return temp;
            temp = temp.next;
        }
        return null;
    }

    void displayEmployeesForward() {
        Employee temp = this.head;
        while (temp != null) {
            System.out.print(temp.id + " ");
            int i = 0;
            while (temp.name[i] != '\0') System.out.print(temp.name[i++]);
            System.out.print(" " + temp.salary + " ");
            i = 0;
            while (temp.department[i] != '\0') System.out.print(temp.department[i++]);
            System.out.println();
            temp = temp.next;
        }
    }

    void displayEmployeesReverse() {
        Employee temp = this.tail;
        while (temp != null) {
            System.out.print(temp.id + " ");
            int i = 0;
            while (temp.name[i] != '\0') System.out.print(temp.name[i++]);
            System.out.print(" " + temp.salary + " ");
            i = 0;
            while (temp.department[i] != '\0') System.out.print(temp.department[i++]);
            System.out.println();
            temp = temp.prev;
        }
    }
}

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payroll payroll = new Payroll();

        payroll.addEmployee(1, new char[]{'A', 'l', 'i', 'c', 'e', '\0'}, 50000, new char[]{'H', 'R', '\0'});
        payroll.addEmployee(2, new char[]{'B', 'o', 'b', '\0'}, 60000, new char[]{'I', 'T', '\0'});
        payroll.addEmployee(3, new char[]{'C', 'a', 'r', 'o', 'l', '\0'}, 55000, new char[]{'H', 'R', '\0'});

        payroll.displayEmployeesForward();
        payroll.updateSalary(2, 65000);
        payroll.displayEmployeesReverse();
        payroll.removeEmployee(1);
        payroll.displayEmployeesForward();

        scanner.close();
    }
}
